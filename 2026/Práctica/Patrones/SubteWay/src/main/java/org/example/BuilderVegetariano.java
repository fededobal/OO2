package org.example;

public class BuilderVegetariano implements SandwichBuilder {
    private Sandwich sandwich;

    @Override
    public void buildPan() {
        sandwich.agregarIngrediente(new Ingrediente("Pan con semillas",120));
    }

    @Override
    public void buildAderezo() {}

    @Override
    public void buildPrincipal() {
        sandwich.agregarIngrediente(new Ingrediente("Provoleta grillada", 200));
    }

    @Override
    public void buildAdicional() {
        sandwich.agregarIngrediente(new Ingrediente("Berenjenas al escabeche", 100));
    }

    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}
