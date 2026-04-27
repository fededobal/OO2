package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpleadoTest {

    private static final double DELTA = 0.001;

    @Test
    void testEmpleadoPasanteSinExamenes() {
        Empleado pasante = new EmpleadoPasante(0);

        assertEquals(17400.0, pasante.getSueldo(), DELTA, "El sueldo del pasante sin exámenes es incorrecto");
    }

    @Test
    void testEmpleadoPasanteConExamenes() {
        Empleado pasante = new EmpleadoPasante(2);

        assertEquals(21200.0, pasante.getSueldo(), DELTA, "El sueldo del pasante con exámenes es incorrecto");
    }

    @Test
    void testEmpleadoPlantaSolteroSinHijosSinAntiguedad() {
        Empleado planta = new EmpleadoPlanta(false, 0, 0);

        assertEquals(43500.0, planta.getSueldo(), DELTA, "El sueldo de planta básico es incorrecto");
    }

    @Test
    void testEmpleadoPlantaCasadoConHijosYAntiguedad() {
        Empleado planta = new EmpleadoPlanta(true, 1, 2);

        assertEquals(53950.0, planta.getSueldo(), DELTA, "El sueldo de planta con todos los adicionales es incorrecto");
    }

    @Test
    void testEmpleadoTemporarioSinHorasSolteroSinHijos() {
        Empleado temporario = new EmpleadoTemporario(0, false, 0);

        assertEquals(17400.0, temporario.getSueldo(), DELTA, "El sueldo temporario básico es incorrecto");
    }

    @Test
    void testEmpleadoTemporarioConHorasCasadoConHijos() {
        Empleado temporario = new EmpleadoTemporario(10, true, 2);

        assertEquals(28560.0, temporario.getSueldo(), DELTA, "El sueldo temporario con horas y adicionales es incorrecto");
    }
}