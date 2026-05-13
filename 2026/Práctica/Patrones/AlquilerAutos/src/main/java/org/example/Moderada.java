package org.example;

import java.time.LocalDate;

public class Moderada extends PoliticaCancelacion {

    private static final double PORC_CANCELACION_DOS_DIAS_ANTES = 0.5;

    @Override
    protected double _calcularReembolso(double montoTotal, LocalDate fechaReserva, LocalDate fechaTentativa) {
        if (fechaReserva.minusDays(6).isAfter(fechaTentativa)) {
            return montoTotal;
        } else if (fechaReserva.minusDays(1).isAfter(fechaTentativa)) {
            return montoTotal * PORC_CANCELACION_DOS_DIAS_ANTES;
        }
        return 0;
    }
}
