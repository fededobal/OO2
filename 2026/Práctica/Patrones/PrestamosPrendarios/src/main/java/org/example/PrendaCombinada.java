package org.example;

import java.util.LinkedList;
import java.util.List;

public class PrendaCombinada extends Prenda {
    private List<Prenda> prendas;

    public PrendaCombinada() {
        this.prendas = new LinkedList<>();
    }

    @Override
    protected double getLiquidez() {
        return 0.5;
    }

    @Override
    protected double getValor() {
        return this.prendas.stream().mapToDouble(Prenda::getValor).sum();
    }

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public void removerPrenda(Prenda prenda) {
        this.prendas.remove(prenda);
    }
}
