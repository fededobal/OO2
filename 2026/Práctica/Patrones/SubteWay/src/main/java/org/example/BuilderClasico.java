package org.example;

public class BuilderClasico implements SandwichBuilder {
    private Sandwich sandwich;

    @Override
    public void buildPan() {
        sandwich.agregarIngrediente(new Ingrediente("Pan Brioche",100));
    }

    @Override
    public void buildAderezo() {
        sandwich.agregarIngrediente(new Ingrediente("Mayonesa",20));
    }

    @Override
    public void buildPrincipal() {
        sandwich.agregarIngrediente(new Ingrediente("Carne de ternera",300));
    }

    @Override
    public void buildAdicional() {
        sandwich.agregarIngrediente(new Ingrediente("Tomate",80));
    }

    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}
