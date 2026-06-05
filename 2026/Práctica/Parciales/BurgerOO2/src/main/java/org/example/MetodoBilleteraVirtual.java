package org.example;

public class MetodoBilleteraVirtual implements MetodoPago {
    @Override
    public double getMontoAPagar(double monto) {
        return monto * 0.95;
    }
}
