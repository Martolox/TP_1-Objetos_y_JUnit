package org.unrn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private final String nombreConcurso;
    private final LocalDate fechaInicio;
    private final LocalDate fechaCierre;
    private List<Participante> participantes = new ArrayList<>();
    private List<Inscripcion> inscripciones = new ArrayList<>();

    public Concurso(String nombre, LocalDate fechaInicio, LocalDate fechaCierre) {
        this.nombreConcurso = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
    }

    public void inscribirParticipante(String nombre, LocalDate fechaInsc) {
        verificarInscripcionEnFecha(fechaInsc);
        agregarParticipante(nombre, fechaInsc);
        inscripciones.add(new Inscripcion(nombre, nombreConcurso, fechaInsc));
    }

    private void verificarInscripcionEnFecha(LocalDate fechaInsc) {
        if (!puedeInscribirse(fechaInsc)) {
            throw new RuntimeException("Inscripción fuera de rango");
        }
    }

    private boolean puedeInscribirse(LocalDate fechaInsc) {
        return (fechaInsc.isBefore(fechaCierre.plusDays(1)) &&
                fechaInsc.isAfter(fechaInicio.minusDays(1)));
    }

    private void agregarParticipante(String nombre, LocalDate fechaInsc) {
        if (esPrimerDia(fechaInsc)) {
            participantes.add(new Participante(nombre, 10));
        } else {
            participantes.add(new Participante(nombre, 0));
        }
    }

    private void agregarInscripcion(String nombre, LocalDate fechaInsc) {
        inscripciones.add(new Inscripcion(nombre, nombreConcurso, fechaInsc));
    }

    private boolean esPrimerDia(LocalDate fechaInsc) {
        return fechaInsc.isEqual(fechaInicio);
    }

    public boolean isParticipante(String nombre) {
        for (Participante p : participantes) {
            if (p.getNombre().equals(nombre)) return true;
        }
        return false;
    }

    public boolean isInscripcion(String nombre, LocalDate fechaInsc) {
        for (Inscripcion i : inscripciones) {
            if (i.getNombre().equals(nombre) && i.getFechaInsc().equals(fechaInsc))
                return true;
        }
        return false;
    }

    public int getPuntaje(String nombre) {
        for (Participante p : participantes) {
            if (!isParticipante(nombre)) return -1;
            if (p.getNombre().equals(nombre)) return p.getScore();
        }
        return 0;
    }
}

