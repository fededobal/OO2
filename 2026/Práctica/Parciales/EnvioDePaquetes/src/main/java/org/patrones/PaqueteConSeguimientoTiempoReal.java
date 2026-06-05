package org.patrones;

public class PaqueteConSeguimientoTiempoReal extends PaqueteDecorator {

    public PaqueteConSeguimientoTiempoReal(IPaquete wrapper) {
        super(wrapper);
    }

    @Override
    public double getCostoEnvio() {
        return super.getCostoEnvio() + 2000;
    }
}
