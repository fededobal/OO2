import org.example.Sistema;
import org.example.Tweet;
import org.example.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwitter {
    private Sistema sistema = new Sistema();

    @BeforeEach
    void SetUp() {
        Usuario fede = new Usuario("fede");
        sistema.agregarUsuario(fede);
        Usuario chechu = new Usuario("chechu");
        sistema.agregarUsuario(chechu);
        Usuario mati = new Usuario("mati");
        sistema.agregarUsuario(mati);
    }

    @Test
    void testUsuarios() {
        Usuario martin = new Usuario("martin");
        Assertions.assertTrue(sistema.agregarUsuario(martin));
        Usuario fede = new Usuario("fede");
        Assertions.assertFalse(sistema.agregarUsuario(fede));
    }

    @Test
    void testTweet() {
        Usuario alvaro = new Usuario("alvaro");
        sistema.agregarUsuario(alvaro);

        Tweet t = new Tweet("Sos un capo!!");
        Assertions.assertTrue(alvaro.twittear(t));

        Usuario isa = new Usuario("isa");
        sistema.agregarUsuario(isa);
        isa.retwittear(t);
        Assertions.assertEquals(1,alvaro.getPosteosValidos().size());
        Assertions.assertEquals(1,isa.getPosteosValidos().size());

        sistema.eliminarUsuario("alvaro");
        Assertions.assertEquals(0,alvaro.getPosteosValidos().size());
        Assertions.assertEquals(0,isa.getPosteosValidos().size());
    }
}