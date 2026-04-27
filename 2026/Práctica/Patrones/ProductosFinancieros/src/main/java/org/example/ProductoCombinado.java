package org.example;

import java.util.LinkedList;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero {
    List<ProductoFinanciero> productos = new LinkedList<>();

    public void agregarProducto(ProductoFinanciero p) {
        this.productos.add(p);
    }

    @Override
    public double retornoInversion(double montoInicial) {
        if (productos.isEmpty()) return montoInicial;

        double montoPorProducto = montoInicial / productos.size();
        double retornoTotal = 0;

        for (ProductoFinanciero p : productos) {
            retornoTotal += p.retornoInversion(montoPorProducto);
        }
        return retornoTotal;
    }
}
