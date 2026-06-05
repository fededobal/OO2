package org.example;

public class ProductoDecorador implements IProducto {
    private IProducto wrapper;

    public ProductoDecorador(IProducto wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public double getPrecio() {
        return this.wrapper.getPrecio();
    }

    @Override
    public String getDescripcion() {
        return this.wrapper.getDescripcion();
    }
}
