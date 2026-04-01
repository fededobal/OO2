package org.example;

public abstract class Empleado {
    private final String nombre;
    private final String apellido;
    private final double sueldoBasico;
    private final static double DESCUENTO = 0.13;

    public Empleado(String nombre, String apellido, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    protected abstract double extra();

    public double sueldo() {
        return this.sueldoBasico + this.extra() - this.sueldoBasico * DESCUENTO;
    }

}
