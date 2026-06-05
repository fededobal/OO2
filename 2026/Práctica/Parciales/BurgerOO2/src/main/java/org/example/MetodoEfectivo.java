package org.example;

public class MetodoEfectivo implements MetodoPago {
    @Override
    public double getMontoAPagar(double monto) {
        return monto;
    }
}
