package org.example;

public abstract class BotonAbstracto {
    public void visualizar() {
        System.out.println("Mostrando boton en modo " + this.modo());
    }
    public abstract String modo();
}
