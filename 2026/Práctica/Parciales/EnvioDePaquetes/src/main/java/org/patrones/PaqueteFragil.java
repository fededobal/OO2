package org.patrones;

public class PaqueteFragil extends PaqueteDecorator {

    public PaqueteFragil(IPaquete wrapper) {
        super(wrapper);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " frágil";
    }
}
