package org.example;

import java.util.List;

public abstract class Sugerencia {
    private Decodificador contexto;

    public Sugerencia(Decodificador decodificador) {
        this.contexto = decodificador;
    }
    abstract List<Pelicula> sugerir(Decodificador decodificador);
}
