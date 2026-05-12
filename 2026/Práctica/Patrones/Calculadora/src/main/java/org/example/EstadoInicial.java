package org.example;

public class EstadoInicial extends Estado {
    public EstadoInicial(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    String getResultado(Calculadora calculadora) {
        return String.valueOf(calculadora.getValorAcumulado());
    }

    @Override
    void setValor(Calculadora calculadora, double unValor) {
        calculadora.setValorAcumulado(unValor);
    }

    @Override
    void mas(Calculadora calculadora) {
        calculadora.setOperacion(new Suma());
        calculadora.cambiarEstado(new EstadoEsperando(calculadora));
    }

    @Override
    void menos(Calculadora calculadora) {
        calculadora.setOperacion(new Restar());
        calculadora.cambiarEstado(new EstadoEsperando(calculadora));
    }

    @Override
    void por(Calculadora calculadora) {
        calculadora.setOperacion(new Multiplicar());
        calculadora.cambiarEstado(new EstadoEsperando(calculadora));
    }

    @Override
    void dividido(Calculadora calculadora) {
        calculadora.setOperacion(new Dividir());
        calculadora.cambiarEstado(new EstadoEsperando(calculadora));
    }
}
