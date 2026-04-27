package org.example;

public abstract class Empleado {
    public double getSueldo() {
        return getBasico() + getAdicional() - getDescuento();
    }

    abstract double getBasico();
    abstract double getAdicional();
    abstract double getDescuento();
}
