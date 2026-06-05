package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfiliadoTest {

    private Afiliado pedro;

    @BeforeEach
    void setUp() {
        PlanMedico planObligatorio = new PlanObligatorio();
        pedro = new Afiliado(
                "Pedro",
                2,
                100000.0,
                LocalDate.of(1999, 1, 1),
                planObligatorio,
                new NullCoseguro()
        );
    }

    @Test
    void testCalculoEjemploEnunciado_PlanObligatorio() {
        assertEquals(23000.0, pedro.calcularMonto(), 0.01);
    }

    @Test
    void testCalculoPlanIntegral_SinCoseguro() {
        pedro.setPlanMedico(new PlanIntegral());

        assertEquals(33100.0, pedro.calcularMonto(), 0.01);
    }

    @Test
    void testCalculoPlanIntegral_ConCoseguroUnAnioAntiguedad() {
        pedro.setPlanMedico(new PlanIntegral());

        Coseguro coseguroSimulado = new Coseguro("OSDE", 0, 0) {
            @Override
            public int getAntiguedad() {
                return 1;
            }
        };

        pedro.setCoseguro(coseguroSimulado);

        assertEquals(30100.0, pedro.calcularMonto(), 0.01);
    }
}