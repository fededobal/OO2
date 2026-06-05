package org.example;

public class ArmaduraDeAcero implements Armadura {

    @Override
    public int defenderContra(Arma arma) {
        return arma.dañoContraAcero();
    }
}
