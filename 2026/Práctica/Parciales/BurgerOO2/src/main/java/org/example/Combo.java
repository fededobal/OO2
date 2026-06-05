package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Combo implements IProducto {
    private List<IProducto> productos;

    public Combo() {
        this.productos = new LinkedList<>();
    }

    public void agregarProducto(IProducto producto) {
        this.productos.add(producto);
    }

    @Override
    public double getPrecio() {
        return this.productos.stream().mapToDouble(IProducto::getPrecio).sum() * 0.85;
    }

    @Override
    public String getDescripcion() {
        return this.productos.stream().map(IProducto::getDescripcion).collect(Collectors.joining(","));
    }
}
