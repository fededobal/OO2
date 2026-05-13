package org.example;

import java.time.LocalDate;

public class Flexible extends PoliticaCancelacion {
    @Override
    protected double _calcularReembolso(double montoTotal, LocalDate fechaReserva, LocalDate fechaTentativa) {
        return montoTotal;
    }
}
