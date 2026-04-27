package org.example;

public class BuilderVegano implements SandwichBuilder {
    private Sandwich sandwich;

    @Override
    public void buildPan() {
        sandwich.agregarIngrediente(new Ingrediente("Pan integral",100));
    }

    @Override
    public void buildAderezo() {
        sandwich.agregarIngrediente(new Ingrediente("Salsa criolla",20));
    }

    @Override
    public void buildPrincipal() {
        sandwich.agregarIngrediente(new Ingrediente("Milanesa de girgolas",500));
    }

    @Override
    public void buildAdicional() {}

    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}
