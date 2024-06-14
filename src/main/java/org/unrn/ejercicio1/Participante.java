package org.unrn.ejercicio1;

public class Participante {
    private final String nombre;
    private int score;

    public Participante(String nombre, int score) {
        this.nombre = nombre;
        this.score = score;
    }

    public String getNombre() {
        return nombre;
    }

    public int getScore() {
        return score;
    }
}
