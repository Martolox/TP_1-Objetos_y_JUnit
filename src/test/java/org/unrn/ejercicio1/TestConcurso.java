package org.unrn.ejercicio1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TestConcurso {

    private Concurso c = new Concurso("Concurso 1",
            LocalDate.now().minusDays(1),
            LocalDate.now().plusDays(10));

    @Test
    public void puedoInscribirParticipante() {
        c.inscribirParticipante("Pedro", LocalDate.now());
        assertTrue(c.isParticipante("Pedro"));
        assertTrue(c.isInscripcion("Pedro", LocalDate.now()));
    }

    @Test
    public void participanteSeInscribeElPrimerDia() {
        c.inscribirParticipante("Marcos", LocalDate.now().minusDays(1));
        assertEquals(10, c.getPuntaje("Marcos"));
    }

    @Test
    public void RuntimeException() {
        assertThrows(RuntimeException.class, () ->
                c.inscribirParticipante("Juan", LocalDate.now().minusDays(2)));
    }
}
