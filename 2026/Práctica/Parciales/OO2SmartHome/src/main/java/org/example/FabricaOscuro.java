package org.example;

public class FabricaOscuro implements FabricaAbstractaTema {
    @Override
    public BotonAbstracto crearBoton() {
        return new BotonOscuro();
    }

    @Override
    public PanelAbstracto crearPanel() {
        return new PanelOscuro();
    }
}
