package org.example;

public class CreadorThoor extends Creador {
    @Override
    Personaje fabricar() {
        Personaje thoor = new Personaje("Thoor",new ArmaduraDeHierro(),new Martillo());
        thoor.agregarHabilidad("Lanzar rayos");
        thoor.agregarHabilidad("Combate a distancia");
        return thoor;
    }
}
