package org.example;

public class DirectorSandwich {

    public void construir(SandwichBuilder builder) {
        builder.buildPan();
        builder.buildAderezo();
        builder.buildPrincipal();
        builder.buildAdicional();
    }
}