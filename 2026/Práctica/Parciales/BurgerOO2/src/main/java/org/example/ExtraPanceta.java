package org.example;

public class ExtraPanceta extends ProductoDecorador {
    public ExtraPanceta(IProducto wrapper) {
        super(wrapper);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 800;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con panceta";
    }
}
