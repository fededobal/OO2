package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExcursionTest {

    private Excursion excursion;
    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;

    @BeforeEach
    void setUp() {
        excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                LocalDate.now().plusDays(10),
                LocalDate.now().plusDays(12),
                "Río Paraná",
                15000.0,
                1,
                2
        );

        usuario1 = new Usuario("Ana", "García", "ana@email.com");
        usuario2 = new Usuario("Luis", "Pérez", "luis@email.com");
        usuario3 = new Usuario("Carlos", "Gómez", "carlos@email.com");

        excursion.inscribir(usuario1);
        excursion.inscribir(usuario2);
    }

    @Test
    void testInscribirUsuarioConCupoMaximoAlcanzado() {
        assertEquals(2, excursion.getCantidadInscriptos());
        assertEquals(0, excursion.getCantidadEspera());

        excursion.inscribir(usuario3);

        assertEquals(2, excursion.getCantidadInscriptos(), "La lista de inscriptos no debe superar el cupo máximo");

        assertEquals(1, excursion.getCantidadEspera(), "El usuario debería haber entrado en la lista de espera");

        String info = excursion.obtenerInformacion();
        assertTrue(info.contains("Dos días en kayak"), "La info debe contener el nombre");
        assertTrue(!info.contains("Emails de inscriptos"), "En cupo máximo no se deben mostrar los emails");
    }
}