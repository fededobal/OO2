package org.example;

import java.util.LinkedList;
import java.util.List;

public class Sandwich {
    private List<Ingrediente> ingredientes = new LinkedList<>();

    public void agregarIngrediente(Ingrediente ing) {
        if (ing != null) {
            this.ingredientes.add(ing);
        }
    }

    public double getPrecioTotal() {
        return ingredientes.stream().mapToDouble(Ingrediente::getPrecio).sum();
    }
}
