package org.example;

import java.time.LocalDate;

public abstract class PoliticaCancelacion {

    protected double calcularReembolso(double montoTotal,LocalDate fechaReserva, LocalDate fechaTentativa) {
        if (fechaTentativa.isBefore(fechaReserva)) {
            return _calcularReembolso(montoTotal,fechaReserva,fechaTentativa);
        }
        return 0;
    }

    protected abstract double _calcularReembolso(double montoTotal, LocalDate fechaReserva, LocalDate fechaTentativa);
}
