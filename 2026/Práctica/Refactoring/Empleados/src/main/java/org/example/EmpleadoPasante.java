package org.example;

public class EmpleadoPasante extends Empleado {

    public EmpleadoPasante(String nombre, String apellido, double sueldoBasico) {
        super(nombre, apellido, sueldoBasico);
    }

    protected double extra() {
        return 0;
    }
}