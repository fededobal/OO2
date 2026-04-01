// File: src/test/java/org/example/EmpleadoTemporarioTest.java

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTemporarioTest {

    @Test
    public void testSueldo_SoloConHijos_HorasCeroPorDefecto() {
        Empleado temporario = new EmpleadoTemporario("Carlos", "Ruiz", 1000.0, 1,5);
        double sueldoEsperado = 4370.0;
        double sueldoCalculado = temporario.sueldo();
        assertEquals(sueldoEsperado, sueldoCalculado, 0.001);
    }

    @Test
    public void testSueldo_ConHijosYHorasTrabajadas_DebeSumarAmbosExtras() {
        EmpleadoTemporario temporario = new EmpleadoTemporario("Carlos", "Ruiz", 1000.0, 2,10);
        double sueldoEsperado = 7870.0;
        double sueldoCalculado = temporario.sueldo();
        assertEquals(sueldoEsperado, sueldoCalculado, 0.001);
    }
}