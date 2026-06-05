package org.example;

public class Producto implements IProducto {
    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
}
