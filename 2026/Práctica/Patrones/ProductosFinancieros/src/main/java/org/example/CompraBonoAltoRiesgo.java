package org.example;

public class CompraBonoAltoRiesgo extends ProductoFinanciero {
    private int parking;

    public CompraBonoAltoRiesgo(int parking) {
        this.parking = parking;
    }

    public double retornoInversion(double montoInicial) {
        double variacion = (Math.random() * 1.40) - 0.70;
        return montoInicial + (montoInicial * variacion);
    }
}
