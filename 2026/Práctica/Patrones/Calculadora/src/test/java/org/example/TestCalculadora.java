package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadora {
    Calculadora calc = new Calculadora();
    @Test
    void test() {
        calc.setValor(5); // Establece el valor inicial
        calc.mas(); // Prepara para sumar
        calc.setValor(3); // Suma 3 al valor acumulado
        System.out.println(calc.resultado()); // Imprimirá "8.0"
        calc.por();
        calc.setValor(2);
        assertEquals("16.0", calc.resultado());
    }

}
