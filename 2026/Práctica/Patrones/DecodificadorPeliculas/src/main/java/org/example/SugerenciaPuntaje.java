package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPuntaje extends Sugerencia {
    public SugerenciaPuntaje(Decodificador decodificador) {
        super(decodificador);
    }

    public List<Pelicula> sugerir(Decodificador decodificador) {
        List<Pelicula> grilla = decodificador.getGrilla();
        List<Pelicula> reproducidas = decodificador.getReproducidas();
        return grilla.stream()
                .filter(p -> !reproducidas.contains(p))
                .sorted(Comparator.comparingDouble(Pelicula::getPuntaje).thenComparing(Pelicula::getAñoEstreno))
                .limit(3)
                .collect(Collectors.toList());
    }
}
