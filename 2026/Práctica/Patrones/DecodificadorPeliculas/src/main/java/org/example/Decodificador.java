package org.example;

import java.util.List;

public class Decodificador {
    private List<Pelicula> grilla;
    private List<Pelicula> reproducidas;
    private Sugerencia criterioSugerencia;

    public Decodificador() {
        this.criterioSugerencia = new SugerenciaPuntaje(this);
    }

    public List<Pelicula> getGrilla() {
        return grilla;
    }

    public List<Pelicula> getReproducidas() {
        return reproducidas;
    }

    public void setCriterioSugerencia(Sugerencia criterioSugerencia) {
        this.criterioSugerencia = criterioSugerencia;
    }

    public List<Pelicula> sugerirPeliculas() {
        return criterioSugerencia.sugerir(this);
    }
}
