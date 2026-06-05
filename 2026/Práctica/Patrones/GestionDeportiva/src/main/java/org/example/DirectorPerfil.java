package org.example;

public class DirectorPerfil {
    private Builder builderPerfiles;

    public DirectorPerfil(Builder builder) {
        this.builderPerfiles = builder;
    }

    public void setBuilder(Builder builder) {
        this.builderPerfiles = builder;
    }

    public void construirPerfil(String nombre) {
        this.builderPerfiles
                .buildNombre(nombre)
                .buildRutina()
                .buildNivelAcceso();
    }
}