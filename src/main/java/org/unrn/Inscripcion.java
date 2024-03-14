package org.unrn;

import java.time.LocalDate;
import java.util.Objects;

public class Inscripcion {
    private final String nombre;
    private final String nombreConcurso;
    private final LocalDate fechaInsc;

    public Inscripcion(String nombre, String nombreConcurso, LocalDate fechaInsc) {
        this.nombre = nombre;
        this.nombreConcurso = nombreConcurso;
        this.fechaInsc = fechaInsc;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInsc() {
        return fechaInsc;
    }
}
