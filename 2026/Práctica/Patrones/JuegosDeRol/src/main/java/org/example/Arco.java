package org.example;

public class Arco implements Arma {
    @Override
    public int dañoContraCuero() {
        return 5;
    }

    @Override
    public int dañoContraHierro() {
        return 3;
    }

    @Override
    public int dañoContraAcero() {
        return 2;
    }
}
