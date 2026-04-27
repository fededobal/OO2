package org.example;

public class BuilderProductoFinancieroGold extends BuilderProductoFinanciero {
    @Override
    public void agregarPlazoFijo() {
        producto.agregarProducto(new PlazoFijo(30,0.06));
    }

    @Override
    public void agregarCompraBonosBajoRiesgo() {
        producto.agregarProducto(new CompraBonoBajoRiesgo(24));
    }

    @Override
    public void agregarCompraBonosAltoRiesgo() {
        producto.agregarProducto(new CompraBonoAltoRiesgo(24));
    }
}
