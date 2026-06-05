package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Coseguro {
    private String nombre;
    private int descuento;
    private LocalDate fechaIngreso;
    private double montoCoberturaViajes;

    public Coseguro(String nombre, int descuento, double montoCoberturaViajes) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.fechaIngreso = LocalDate.now();
        this.montoCoberturaViajes = montoCoberturaViajes;
    }

    protected Coseguro() {

    }

    public double getDescuento() {
        return this.descuento;
    }

    public int getAntiguedad() {
        return (int) ChronoUnit.YEARS.between(this.fechaIngreso, LocalDate.now());
    }

    public double getMontoCoberturaViajes() {
        return montoCoberturaViajes;
    }
}
