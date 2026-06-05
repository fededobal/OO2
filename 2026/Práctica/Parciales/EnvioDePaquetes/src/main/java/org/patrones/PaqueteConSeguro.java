package org.patrones;

public class PaqueteConSeguro extends PaqueteDecorator {

    public PaqueteConSeguro(IPaquete wrapper) {
        super(wrapper);
    }

    @Override
    public double getCostoEnvio() {
        return super.getCostoEnvio() + getValorDeclarado() * 0.2;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con seguro";
    }
}
