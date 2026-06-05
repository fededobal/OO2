package org.example;

public class Martillo implements Arma {
    @Override
    public int dañoContraCuero() {
        return 4;
    }

    @Override
    public int dañoContraHierro() {
        return 2;
    }

    @Override
    public int dañoContraAcero() {
        return 1;
    }
}
