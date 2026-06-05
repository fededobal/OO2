package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrendasTest {

    @Test
    void testAlquiler() {
        LocalDate hoy = LocalDate.now();
        LocalDate fin = hoy.plusMonths(12);
        Alquiler alquiler = new Alquiler(hoy, fin, 2000.0);

        assertEquals(24000.0, alquiler.getValor(), 0.001);
        assertEquals(21600.0, alquiler.getValorPrendario(), 0.001);
    }

    @Test
    void testAutomovil() {
        Automovil auto = new Automovil(3, 20000.0, "Toyota", 35000.0);

        assertEquals(14000.0, auto.getValor(), 0.001);
        assertEquals(9800.0, auto.getValorPrendario(), 0.001);
    }

    @Test
    void testInmueble() {
        Inmueble inmueble = new Inmueble(100.0, 1500.0, "Avenida 7");

        assertEquals(150000.0, inmueble.getValor(), 0.001);
        assertEquals(30000.0, inmueble.getValorPrendario(), 0.001);
    }

    @Test
    void testPrendaCombinada() {
        Automovil auto = new Automovil(3, 20000.0, "Toyota", 35000.0);
        Inmueble inmueble = new Inmueble(100.0, 1500.0, "Avenida 7");

        PrendaCombinada combinada = new PrendaCombinada();
        combinada.agregarPrenda(auto);
        combinada.agregarPrenda(inmueble);

        assertEquals(164000.0, combinada.getValor(), 0.001);
        assertEquals(82000.0, combinada.getValorPrendario(), 0.001);
    }

    @Test
    void testPrendaCombinadaRemover() {
        Automovil auto = new Automovil(3, 20000.0, "Toyota", 35000.0);
        Inmueble inmueble = new Inmueble(100.0, 1500.0, "Avenida 7");

        PrendaCombinada combinada = new PrendaCombinada();
        combinada.agregarPrenda(auto);
        combinada.agregarPrenda(inmueble);
        combinada.removerPrenda(auto);

        assertEquals(150000.0, combinada.getValor(), 0.001);
        assertEquals(75000.0, combinada.getValorPrendario(), 0.001);
    }
}