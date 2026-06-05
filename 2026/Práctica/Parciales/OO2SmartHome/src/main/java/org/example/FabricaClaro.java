package org.example;

public class FabricaClaro implements FabricaAbstractaTema {
    @Override
    public BotonAbstracto crearBoton() {
        return new BotonClaro();
    }

    @Override
    public PanelAbstracto crearPanel() {
        return new PanelClaro();
    }
}
