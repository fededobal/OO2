package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Prenda {
    private LocalDate comienzoContrato, finContrato;
    private double costoMensual;

    public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
        this.comienzoContrato = comienzoContrato;
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
    }

    @Override
    protected double getLiquidez() {
        return 0.9;
    }

    @Override
    protected double getValor() {
        return this.costoMensual * Math.max(0,ChronoUnit.MONTHS.between(LocalDate.now(),this.finContrato));
    }
}
