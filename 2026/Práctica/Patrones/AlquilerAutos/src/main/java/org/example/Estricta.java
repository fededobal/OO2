package org.example;

import java.time.LocalDate;

public class Estricta extends PoliticaCancelacion {
    @Override
    protected double _calcularReembolso(double montoTotal, LocalDate fechaReserva, LocalDate fechaTentativa) {
        return 0;
    }
}
