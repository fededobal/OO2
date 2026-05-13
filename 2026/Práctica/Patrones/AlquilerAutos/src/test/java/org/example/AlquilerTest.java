package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlquilerTest {
    private AutoEnAlquiler auto;

    @BeforeEach
    void SetUp() {
        auto = new AutoEnAlquiler(50,6,"Volkswagen",new Flexible());
        // asumiendo cantidadDias = 10...
        // asumiendo fechaReserva = 30/5/2026 y fechaTentativa 20/5/2026
    }

    @Test
    void politicaTest() {
        assertEquals(0,auto.montoAReembolsar(500, LocalDate.of(2026,5,30),LocalDate.of(2026,6,1)));
        assertEquals(500,auto.montoAReembolsar(500, LocalDate.of(2026,5,30),LocalDate.of(2026,5,20)));
        auto.cambiarPoliticaCancelacion(new Moderada());
        assertEquals(0,auto.montoAReembolsar(500, LocalDate.of(2026,5,30),LocalDate.of(2026,6,1)));
        assertEquals(500,auto.montoAReembolsar(500, LocalDate.of(2026,5,30),LocalDate.of(2026,5,20)));
        assertEquals(250,auto.montoAReembolsar(500, LocalDate.of(2026,5,30),LocalDate.of(2026,5,24)));
        assertEquals(0,auto.montoAReembolsar(500, LocalDate.of(2026,5,30),LocalDate.of(2026,5,29)));
        auto.cambiarPoliticaCancelacion(new Estricta());
        assertEquals(0,auto.montoAReembolsar(500, LocalDate.of(2026,5,30),LocalDate.of(2026,5,20)));
    }
}
