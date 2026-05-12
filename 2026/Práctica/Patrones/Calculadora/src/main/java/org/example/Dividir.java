package org.example;

public class Dividir extends Operacion {
    public double operar(double d1, double d2) {
        return d1 / d2;
    }

    @Override
    public boolean esValido(double d2) {
        return d2 != 0;
    }
}
