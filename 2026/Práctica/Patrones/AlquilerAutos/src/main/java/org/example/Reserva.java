package org.example;

import java.time.LocalDate;

public class Reserva {
    private int cantidadDias;
    private LocalDate fecha;
    private Usuario conductor;
    private AutoEnAlquiler autoEnAlquiler;
//    private PoliticaCancelacion politicaCancelacion; para guardarme la politica que habia al momento de reservar (?)

    public Reserva(int cantidadDias, LocalDate fecha, Usuario conductor, AutoEnAlquiler autoEnAlquiler) {
        this.cantidadDias = cantidadDias;
        this.fecha = fecha;
        this.conductor = conductor;
        this.autoEnAlquiler = autoEnAlquiler;
//        this.politicaCancelacion = autoEnAlquiler.getPoliticaCancelacion();
    }

    public double montoAPagar() {
        return cantidadDias * autoEnAlquiler.getPrecioPorDia();
    }

    public double montoAReembolsar(LocalDate fechaTentativa) {
        return autoEnAlquiler.montoAReembolsar(montoAPagar(),this.fecha,fechaTentativa);
    }
}
