package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BibliotecaTest {

    public static void main(String[] args) {
        Socio socio1 = new Socio("Ana","ana@gmail.com","1234/5");
        Socio socio2 = new Socio("Fede","fede@gmail.com","1234/8");
        Biblioteca b = new Biblioteca();
        b.agregarSocio(socio1);
        b.agregarSocio(socio2);
        System.out.println(b.exportarSocios());
    }
}
