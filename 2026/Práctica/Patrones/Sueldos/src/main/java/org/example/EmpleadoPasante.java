package org.example;

public class EmpleadoPasante extends Empleado {
    private int cantExamenesRendidos;
    static final double BASE_BASICO = 20000;
    static final double MONTO_EXAMEN = 2000;
    static final double PORC_DESC_BASICO = 0.13;
    static final double PORC_DESC_ADICIONAL = 0.05;

    public EmpleadoPasante(int cantExamenesRendidos) {
        this.cantExamenesRendidos = cantExamenesRendidos;
    }

    @Override
    double getBasico() {
        return BASE_BASICO;
    }

    @Override
    double getAdicional() {
        return cantExamenesRendidos * MONTO_EXAMEN;
    }

    @Override
    double getDescuento() {
        return getBasico() * PORC_DESC_BASICO + getAdicional() * PORC_DESC_ADICIONAL;
    }
}
