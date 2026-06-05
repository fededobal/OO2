package org.example;

public class ArmaduraDeCuero implements Armadura {

    @Override
    public int defenderContra(Arma arma) {
        return arma.dañoContraCuero();
    }
}
