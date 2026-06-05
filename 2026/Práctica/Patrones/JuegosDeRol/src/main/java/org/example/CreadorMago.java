package org.example;

public class CreadorMago extends Creador {
    @Override
    Personaje fabricar() {
        Personaje mago = new Personaje("Mago",new ArmaduraDeCuero(),new Baston());
        mago.agregarHabilidad("Magia");
        mago.agregarHabilidad("Combate a distancia");
        return mago;
    }
}
