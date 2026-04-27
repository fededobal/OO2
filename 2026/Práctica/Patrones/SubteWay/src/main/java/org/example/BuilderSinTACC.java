package org.example;

public class BuilderSinTACC implements SandwichBuilder {
    private Sandwich sandwich;

    @Override
    public void buildPan() {
        sandwich.agregarIngrediente(new Ingrediente("Pan de chipa",150));
    }

    @Override
    public void buildAderezo() {
        sandwich.agregarIngrediente(new Ingrediente("Salsa tártara",18));
    }

    @Override
    public void buildPrincipal() {
        sandwich.agregarIngrediente(new Ingrediente("Carne de pollo",250));
    }

    @Override
    public void buildAdicional() {
        sandwich.agregarIngrediente(new Ingrediente("Verduras grilladas",200));
    }

    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}
