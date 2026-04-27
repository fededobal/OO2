package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopografiasTest {

    private Topografia agua;
    private Topografia tierra;
    private Topografia mixtaC;
    private Topografia mixtaD;

    @BeforeEach
    public void setUp() {
        agua = new TopografiaAgua();
        tierra = new TopografiaTierra();

        mixtaC = new TopografiaMixta(
                new TopografiaAgua(), new TopografiaTierra(),
                new TopografiaTierra(), new TopografiaAgua()
        );

        Topografia subMixta = new TopografiaMixta(
                new TopografiaAgua(), new TopografiaTierra(),
                new TopografiaTierra(), new TopografiaAgua()
        );
        mixtaD = new TopografiaMixta(
                new TopografiaAgua(), new TopografiaTierra(),
                new TopografiaTierra(), subMixta
        );
    }

    @Test
    public void testProporcionAgua() {
        assertEquals(1.0, agua.proporcionAgua());
        assertEquals(0.0, tierra.proporcionAgua());

        assertEquals(0.5, mixtaC.proporcionAgua());

        assertEquals(0.375, mixtaD.proporcionAgua());
    }

    @Test
    public void testIgualdadSimples() {
        assertTrue(agua.equals(new TopografiaAgua()));
        assertFalse(agua.equals(tierra));
        assertFalse(tierra.equals(agua));
        assertFalse(agua.equals(mixtaC));
    }

    @Test
    public void testIgualdadMixtas() {
        Topografia otraMixtaC = new TopografiaMixta(
                new TopografiaAgua(), new TopografiaTierra(),
                new TopografiaTierra(), new TopografiaAgua()
        );

        assertTrue(mixtaC.equals(otraMixtaC));

        Topografia mixtaDiferenteOrden = new TopografiaMixta(
                new TopografiaTierra(), new TopografiaAgua(),
                new TopografiaAgua(), new TopografiaTierra()
        );
        assertFalse(mixtaC.equals(mixtaDiferenteOrden));

        assertFalse(mixtaC.equals(mixtaD));
    }
}