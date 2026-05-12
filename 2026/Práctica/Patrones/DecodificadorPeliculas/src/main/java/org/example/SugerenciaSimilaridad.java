package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SugerenciaSimilaridad extends Sugerencia {
    public SugerenciaSimilaridad(Decodificador decodificador) {
        super(decodificador);
    }

    public List<Pelicula> sugerir(Decodificador decodificador) {
        List<Pelicula> reproducidas = decodificador.getReproducidas();
        return reproducidas.stream()
                .flatMap(reproducida -> reproducida.getSimilares().stream())
                .distinct()
                .filter(p -> !reproducidas.contains(p))
                .sorted(Comparator.comparing(Pelicula::getAñoEstreno).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
