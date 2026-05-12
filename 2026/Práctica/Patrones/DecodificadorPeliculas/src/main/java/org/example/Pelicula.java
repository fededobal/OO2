package org.example;

import java.util.List;

public class Pelicula {
    private String titulo;
    private int añoEstreno;
    private double puntaje;
    private List<Pelicula> similares;

    public Pelicula(String titulo, int añoEstreno, double puntaje) {
        this.titulo = titulo;
        this.añoEstreno = añoEstreno;
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public List<Pelicula> getSimilares() {
        return similares;
    }

    public void agregarSimilar(Pelicula p) {
        this.similares.add(p);
        p.getSimilares().add(this);
    }
}
