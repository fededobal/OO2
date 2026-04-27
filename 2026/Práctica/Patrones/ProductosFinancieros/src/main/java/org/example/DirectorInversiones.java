package org.example;

public class DirectorInversiones {

    public void buildProducto1(BuilderProductoFinanciero builder) {
        builder.agregarCompraDolares();
        builder.agregarPlazoFijo();
        builder.agregarCompraPesos();
    }

    public void buildProducto2(BuilderProductoFinanciero builder) {
        builder.agregarCompraBonosBajoRiesgo();
        builder.agregarCompraDolares();
        builder.agregarPlazoFijo();
        builder.agregarCompraPesos();
    }

    public void buildProducto3(BuilderProductoFinanciero builder) {
        builder.agregarCompraBonosAltoRiesgo();
        builder.agregarCompraBonosBajoRiesgo();
        builder.agregarPlazoFijo();
    }

    public void buildProducto4(BuilderProductoFinanciero builder) {
        builder.agregarCompraBonosAltoRiesgo();
        builder.agregarCompraBonosAltoRiesgo();
        builder.agregarCompraBonosAltoRiesgo();
    }
}