package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public interface GeneradorNumero {
    String obtener(SortedSet<String> lineas);
}