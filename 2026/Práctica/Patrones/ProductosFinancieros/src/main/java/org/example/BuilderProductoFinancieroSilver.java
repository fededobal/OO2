package org.example;

public class BuilderProductoFinancieroSilver extends BuilderProductoFinanciero {
    @Override
    public void agregarPlazoFijo() {
        producto.agregarProducto(new PlazoFijo(35,0.05));
    }

    @Override
    public void agregarCompraBonosBajoRiesgo() {
        producto.agregarProducto(new CompraBonoBajoRiesgo(72));
    }

    @Override
    public void agregarCompraBonosAltoRiesgo() {
        producto.agregarProducto(new CompraBonoAltoRiesgo(72));
    }
}
