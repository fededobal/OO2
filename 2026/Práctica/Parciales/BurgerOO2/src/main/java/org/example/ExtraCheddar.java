package org.example;

public class ExtraCheddar extends ProductoDecorador {
    public ExtraCheddar(IProducto wrapper) {
        super(wrapper);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 500;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con cheddar";
    }
}
