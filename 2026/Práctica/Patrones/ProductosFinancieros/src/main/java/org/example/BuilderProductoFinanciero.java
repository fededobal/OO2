package org.example;

public abstract class BuilderProductoFinanciero {
    protected ProductoCombinado producto;

    public void agregarCompraDolares() {
        producto.agregarProducto(new CompraDolares());
    }
    public void agregarCompraPesos() {
        producto.agregarProducto(new CompraPesos());
    }
    abstract void agregarPlazoFijo();
    abstract void agregarCompraBonosBajoRiesgo();
    abstract void agregarCompraBonosAltoRiesgo();
    public ProductoFinanciero obtenerProducto() {
        return this.producto;
    }
}
