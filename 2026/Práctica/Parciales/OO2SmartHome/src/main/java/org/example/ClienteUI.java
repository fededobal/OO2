package org.example;

public class ClienteUI {
    private BotonAbstracto boton;
    private PanelAbstracto panel;
    private FabricaAbstractaTema fabrica;

    public ClienteUI(FabricaAbstractaTema fabrica) {
        this.fabrica = fabrica;
    }

    public void configurarPantalla() {
        this.boton = this.fabrica.crearBoton();
        this.panel = this.fabrica.crearPanel();
    }
}
