package org.example;

public class ArmaduraDeHierro implements Armadura {

    @Override
    public int defenderContra(Arma arma) {
        return arma.dañoContraHierro();
    }
}
