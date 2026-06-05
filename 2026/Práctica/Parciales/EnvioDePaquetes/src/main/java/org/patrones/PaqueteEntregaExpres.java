package org.patrones;

public class PaqueteEntregaExpres extends PaqueteDecorator {

    public PaqueteEntregaExpres(IPaquete wrapper) {
        super(wrapper);
    }

    @Override
    public double getCostoEnvio() {
        return super.getCostoEnvio() + getValorDeclarado() * 0.5;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " entrega express";
    }
}
