// File: src/test/java/org/example/EmpleadoPasanteTest.java

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoPasanteTest {

    @Test
    public void testSueldo_DebeRetornarSueldoBasicoMenosDescuento() {
        // Arrange
        // Sueldo básico: 1000. Descuento (13%): 130. Extra: 0. 
        // Esperado: 1000 + 0 - 130 = 870
        Empleado pasante = new EmpleadoPasante("Juan", "Perez", 1000.0);
        double sueldoEsperado = 870.0;

        // Act
        double sueldoCalculado = pasante.sueldo();

        // Assert
        assertEquals(sueldoEsperado, sueldoCalculado, 0.001, "El sueldo del pasante es incorrecto");
    }
}