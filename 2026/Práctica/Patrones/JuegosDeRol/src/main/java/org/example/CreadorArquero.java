package org.example;

public class CreadorArquero extends Creador {
    @Override
    Personaje fabricar() {
        return new Personaje("Arquero",new ArmaduraDeCuero(),new Arco());
    }
}
