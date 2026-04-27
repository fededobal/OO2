package org.example;

public class CompraBonoBajoRiesgo extends ProductoFinanciero {
    private int parking;

    public CompraBonoBajoRiesgo(int parking) {
        this.parking = parking;
    }

    public double retornoInversion(double montoInicial) {
        double variacion = (Math.random() * 0.20) - 0.10;
        return montoInicial + (montoInicial * variacion);
    }
}
