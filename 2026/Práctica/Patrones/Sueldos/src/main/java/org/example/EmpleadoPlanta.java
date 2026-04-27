package org.example;

public class EmpleadoPlanta extends Empleado {
    private boolean casado;
    private int cantHijos;
    private int antiguedad;
    static final double BASE_BASICO = 50000;
    static final double MONTO_CASADO = 5000;
    static final double MONTO_HIJO = 2000;
    static final double MONTO_ANTIG = 2000;
    static final double PORC_DESC_BASICO = 0.13;
    static final double PORC_DESC_ADICIONAL = 0.05;

    public EmpleadoPlanta(boolean casado, int cantHijos, int antiguedad) {
        this.casado = casado;
        this.cantHijos = cantHijos;
        this.antiguedad = antiguedad;
    }

    @Override
    double getBasico() {
        return BASE_BASICO;
    }

    @Override
    double getAdicional() {
        double aux = 0;
        if (casado) aux += MONTO_CASADO;
        aux += cantHijos * MONTO_HIJO;
        aux += antiguedad * MONTO_ANTIG;
        return aux;
    }

    @Override
    double getDescuento() {
        return getBasico() * PORC_DESC_BASICO + getAdicional() * PORC_DESC_ADICIONAL;
    }
}
