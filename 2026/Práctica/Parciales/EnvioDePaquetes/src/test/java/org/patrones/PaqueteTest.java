package org.patrones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaqueteTest {
    private Paquete paquete = new Paquete("Caja de libros","Pepito","AAA",20000);

    @Test
    void testPaquete() {
        PaqueteDecorator seguro = new PaqueteConSeguro(paquete);
        PaqueteEntregaExpres express = new PaqueteEntregaExpres(seguro);

        assertEquals(express.getCostoEnvio(),15000);
        assertEquals(express.getDescripcion(),"Caja de libros con seguro entrega express");
    }
}
