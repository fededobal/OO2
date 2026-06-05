package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NullCoseguro extends Coseguro {

    public NullCoseguro() {
        super();
    }

    @Override
    public double getDescuento() {
        return 0;
    }

    @Override
    public int getAntiguedad() {
        return 0;
    }

    @Override
    public double getMontoCoberturaViajes() {
        return 0;
    }
}
