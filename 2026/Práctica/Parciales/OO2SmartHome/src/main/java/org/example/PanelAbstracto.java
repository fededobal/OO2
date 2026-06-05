package org.example;

public abstract class PanelAbstracto {
    public void visualizar() {
        System.out.println("Mostrando panel en modo " + this.modo());
    }
    public abstract String modo();
}
