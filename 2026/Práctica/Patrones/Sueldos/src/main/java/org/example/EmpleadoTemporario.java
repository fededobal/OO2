package org.example;

public class EmpleadoTemporario extends Empleado {
    private int cantHorasTrabajadas;
    private boolean casado;
    private int cantHijos;
    static final double BASE_BASICO = 20000;
    static final double MONTO_HORA = 300;
    static final double MONTO_CASADO = 5000;
    static final double MONTO_HIJO = 2000;
    static final double PORC_DESC_BASICO = 0.13;
    static final double PORC_DESC_ADICIONAL = 0.05;

    public EmpleadoTemporario(int cantHorasTrabajadas, boolean casado, int cantHijos) {
        this.cantHorasTrabajadas = cantHorasTrabajadas;
        this.casado = casado;
        this.cantHijos = cantHijos;
    }

    @Override
    double getBasico() {
        return BASE_BASICO + cantHorasTrabajadas * MONTO_HORA;
    }

    @Override
    double getAdicional() {
        double aux = 0;
        if (casado) aux += MONTO_CASADO;
        aux += cantHijos * MONTO_HIJO;
        return aux;
    }

    @Override
    double getDescuento() {
        return getBasico() * PORC_DESC_BASICO + getAdicional() * PORC_DESC_ADICIONAL;
    }
}
