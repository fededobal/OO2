package org.example;

public class EmpleadoTemporario extends Empleado {
    private final double horasTrabajadas;
    private final int cantidadHijos;
    private static final int COEF_HORAS_TRABAJADAS = 500;
    private static final int COEF_HIJOS = 1000;

    public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, int cantidadHijos, double horasTrabajadas) {
        super(nombre, apellido, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
        this.horasTrabajadas = horasTrabajadas;
    }

    protected double extra() {
        return (this.horasTrabajadas * COEF_HORAS_TRABAJADAS)
                + (this.cantidadHijos * COEF_HIJOS);
    }
}
