package org.example;

public class CreadorGuerrero extends Creador {
    @Override
    Personaje fabricar() {
        Personaje guerrero = new Personaje("Guerrero",new ArmaduraDeAcero(),new Espada());
        guerrero.agregarHabilidad("Combate cuerpo a cuerpo");
        return guerrero;
    }
}
