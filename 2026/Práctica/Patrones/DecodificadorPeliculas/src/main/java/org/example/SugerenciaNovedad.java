package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaNovedad extends Sugerencia {
    public SugerenciaNovedad(Decodificador decodificador) {
        super(decodificador);
    }

    public List<Pelicula> sugerir(Decodificador decodificador) {
        List<Pelicula> grilla = decodificador.getGrilla();
        List<Pelicula> reproducidas = decodificador.getReproducidas();
        return grilla.stream()
                .filter(p -> !reproducidas.contains(p))
                .sorted(Comparator.comparing(Pelicula::getAñoEstreno).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
