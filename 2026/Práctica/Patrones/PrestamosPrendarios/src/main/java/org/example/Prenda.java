package org.example;

public abstract class Prenda {
    protected abstract double getLiquidez();
    protected abstract double getValor();
    public double getValorPrendario() {
        return this.getLiquidez() * this.getValor();
    }


}
