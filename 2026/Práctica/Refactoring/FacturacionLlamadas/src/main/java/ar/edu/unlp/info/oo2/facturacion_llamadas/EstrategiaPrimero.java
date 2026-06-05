package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

class EstrategiaPrimero implements GeneradorNumero {
    public String obtener(SortedSet<String> lineas) {
        String linea = lineas.first();
        lineas.remove(linea);
        return linea;
    }
}
