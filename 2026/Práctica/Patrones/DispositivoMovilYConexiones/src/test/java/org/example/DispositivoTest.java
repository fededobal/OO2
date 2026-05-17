package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DispositivoTest {

    private Dispositivo dispositivo;
    private Connection wifi;
    private CRC_Calculator crc16;

    @BeforeEach
    void setUp() {
        // Estado inicial del dispositivo: WiFi y CRC16
        wifi = new WifiConn("PictWifi");
        crc16 = new CRC16_Calculator();
        dispositivo = new Dispositivo(wifi, crc16);
    }

    @Test
    void testSendInicial() {
        String datos = "Hola UNLP";
        Integer crcEsperado = crc16.crcFor(datos);

        String resultado = dispositivo.send(datos);

        // Verificamos que se use WiFi y que el CRC calculado sea el de 16 bits
        String stringEsperado = "WiFi transmitiendo: " + datos + " con CRC: " + crcEsperado;
        assertEquals(stringEsperado, resultado);
    }

    @Test
    void testConectarCon() {
        String datos = "Hola UNLP";

        // Instanciamos el adaptador que envuelve a la nueva conexión 4G
        Connection adaptador4G = new Connection4GAdapter("Symb4G");

        // Cambiamos la conexión en tiempo de ejecución
        dispositivo.conectarCon(adaptador4G);

        String resultado = dispositivo.send(datos);
        Integer crcEsperado = crc16.crcFor(datos); // El CRC sigue siendo 16 porque no lo cambiamos

        // Verificamos que ahora el String provenga de la conexión 4G adaptada
        String stringEsperado = "4G transmitiendo: " + datos + " con CRC: " + crcEsperado;
        assertEquals(stringEsperado, resultado);
    }

    @Test
    void testConfigurarCRC() {
        String datos = "Hola UNLP";

        // Instanciamos el nuevo calculador de 32 bits
        CRC_Calculator crc32 = new CRC32_Calculator();

        // Inyectamos la nueva estrategia de cálculo
        dispositivo.configurarCRC(crc32);

        String resultado = dispositivo.send(datos);
        Integer crcEsperado32 = crc32.crcFor(datos);

        // Verificamos que la conexión siga siendo WiFi pero el valor numérico corresponda al CRC32
        String stringEsperado = "WiFi transmitiendo: " + datos + " con CRC: " + crcEsperado32;
        assertEquals(stringEsperado, resultado);
    }

    @Test
    void testConectarConYConfigurarCRC() {
        // Prueba combinada: cambiamos ambas cosas
        String datos = "Prueba final";

        Connection adaptador4G = new Connection4GAdapter("Symb4G");
        CRC_Calculator crc32 = new CRC32_Calculator();

        dispositivo.conectarCon(adaptador4G);
        dispositivo.configurarCRC(crc32);

        String resultado = dispositivo.send(datos);
        Integer crcEsperado = crc32.crcFor(datos);

        String stringEsperado = "4G transmitiendo: " + datos + " con CRC: " + crcEsperado;
        assertEquals(stringEsperado, resultado);
    }
}