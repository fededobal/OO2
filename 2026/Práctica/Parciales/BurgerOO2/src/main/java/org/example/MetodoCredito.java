package org.example;

public class MetodoCredito implements MetodoPago {
    @Override
    public double getMontoAPagar(double monto) {
        return monto * 1.08;
    }
}
