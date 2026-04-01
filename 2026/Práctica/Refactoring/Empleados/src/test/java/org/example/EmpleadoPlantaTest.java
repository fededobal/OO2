// File: src/test/java/org/example/EmpleadoPlantaTest.java

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoPlantaTest {

    @Test
    public void testSueldo_ConHijos_DebeSumarAsignacionPorHijo() {
        // Arrange
        // Sueldo básico: 1000. Hijos: 2 (2 * 2000 = 4000). Descuento (13% de 1000): 130.
        // Esperado: 1000 + 4000 - 130 = 4870
        Empleado planta = new EmpleadoPlanta("Maria", "Gomez", 1000.0, 2);
        double sueldoEsperado = 4870.0;

        // Act
        double sueldoCalculado = planta.sueldo();

        // Assert
        assertEquals(sueldoEsperado, sueldoCalculado, 0.001, "El sueldo del empleado de planta con hijos es incorrecto");
    }

    @Test
    public void testSueldo_SinHijos_SoloAplicaDescuento() {
        // Arrange
        // Sueldo básico: 1000. Hijos: 0 (0). Descuento: 130.
        // Esperado: 1000 + 0 - 130 = 870
        Empleado planta = new EmpleadoPlanta("Ana", "Lopez", 1000.0, 0);
        double sueldoEsperado = 870.0;

        // Act
        double sueldoCalculado = planta.sueldo();

        // Assert
        assertEquals(sueldoEsperado, sueldoCalculado, 0.001);
    }
}