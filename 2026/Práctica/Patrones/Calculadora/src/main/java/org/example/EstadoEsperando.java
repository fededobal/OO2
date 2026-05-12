package org.example;

public class EstadoEsperando extends Estado {
    public EstadoEsperando(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    String getResultado(Calculadora calculadora) {
        return String.valueOf(calculadora.getValorAcumulado());
    }

    @Override
    void setValor(Calculadora calculadora, double unValor) {
        Operacion op = calculadora.getOperacion();
        if(op.esValido(unValor)) {
            double resultado = op.operar(calculadora.getValorAcumulado(),unValor);
            calculadora.setValorAcumulado(resultado);
            calculadora.cambiarEstado(new EstadoInicial(calculadora));
        } else {
            calculadora.cambiarEstado(new EstadoError(calculadora));
        }
    }

    @Override
    void mas(Calculadora calculadora) {
        calculadora.cambiarEstado(new EstadoError(calculadora));
    }

    @Override
    void menos(Calculadora calculadora) {
        calculadora.cambiarEstado(new EstadoError(calculadora));
    }

    @Override
    void por(Calculadora calculadora) {
        calculadora.cambiarEstado(new EstadoError(calculadora));
    }

    @Override
    void dividido(Calculadora calculadora) {
        calculadora.cambiarEstado(new EstadoError(calculadora));
    }
}
