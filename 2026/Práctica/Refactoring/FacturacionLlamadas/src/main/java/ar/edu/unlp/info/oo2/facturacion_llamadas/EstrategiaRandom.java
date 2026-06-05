package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

class EstrategiaRandom implements GeneradorNumero {
    public String obtener(SortedSet<String> lineas) {
        String linea = new ArrayList<>(lineas).get(new Random().nextInt(lineas.size()));
        lineas.remove(linea);
        return linea;
    }
}
