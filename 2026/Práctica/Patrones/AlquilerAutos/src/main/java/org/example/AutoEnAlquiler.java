package org.example;

import java.time.LocalDate;

public class AutoEnAlquiler {
    private double precioPorDia;
    private int cantidadPlazas;
    private String marca;
    private PoliticaCancelacion politicaCancelacion;

    public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca, PoliticaCancelacion politicaCancelacion) {
        this.precioPorDia = precioPorDia;
        this.cantidadPlazas = cantidadPlazas;
        this.marca = marca;
        this.politicaCancelacion = politicaCancelacion;
    }

    public void cambiarPoliticaCancelacion(PoliticaCancelacion nueva) {
        this.politicaCancelacion = nueva;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public PoliticaCancelacion getPoliticaCancelacion() {
        return politicaCancelacion;
    }

    public double montoAReembolsar(double montoTotal, LocalDate fechaReserva, LocalDate fechaTentativa) {
        return politicaCancelacion.calcularReembolso(montoTotal, fechaReserva, fechaTentativa);
    }
}
