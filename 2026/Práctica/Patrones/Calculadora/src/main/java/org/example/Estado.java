package org.example;

public abstract class Estado {
    private Calculadora calculadora;

    public Estado(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    abstract String getResultado(Calculadora calculadora);
    abstract void setValor(Calculadora calculadora, double unValor);
    abstract void mas(Calculadora calculadora);
    abstract void menos(Calculadora calculadora);
    abstract void por(Calculadora calculadora);
    abstract void dividido(Calculadora calculadora);
}
