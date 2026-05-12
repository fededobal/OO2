package org.example;

public class EstadoError extends Estado {
    public EstadoError(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    String getResultado(Calculadora calculadora) {
        return "Error";
    }

    @Override
    void setValor(Calculadora calculadora, double unValor) {

    }

    @Override
    void mas(Calculadora calculadora) {

    }

    @Override
    void menos(Calculadora calculadora) {

    }

    @Override
    void por(Calculadora calculadora) {

    }

    @Override
    void dividido(Calculadora calculadora) {

    }
}
