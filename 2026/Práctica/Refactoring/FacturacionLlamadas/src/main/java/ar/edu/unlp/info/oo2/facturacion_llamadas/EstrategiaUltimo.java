package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

class EstrategiaUltimo implements GeneradorNumero {
    public String obtener(SortedSet<String> lineas) {
        String linea = lineas.last();
        lineas.remove(linea);
        return linea;
    }
}
