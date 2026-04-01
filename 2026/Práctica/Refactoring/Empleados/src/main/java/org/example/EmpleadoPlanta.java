package org.example;

public class EmpleadoPlanta extends Empleado {
    private final int cantidadHijos;
    private static final int COEF_HIJOS = 2000;

    public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        super(nombre,apellido,sueldoBasico);
        this.cantidadHijos = cantidadHijos;
    }

    protected double extra() {
        return this.cantidadHijos * COEF_HIJOS;
    }
}