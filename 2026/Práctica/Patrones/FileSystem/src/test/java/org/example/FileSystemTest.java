package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileSystemTest {
    private FileSystem fs = new FileSystem();

    @BeforeEach
    void SetUp() {
        fs.agregarElemento(new Archivo("Hola",5));
        fs.agregarElemento(new Archivo("AA",1));
        fs.agregarElemento(new Archivo("BB",20));
        fs.agregarElemento(new Archivo("CC",25));
        Directorio dir1 = new Directorio("DIR1");
        fs.agregarElemento(dir1);
        fs.agregarElemento(dir1);
        fs.agregarElemento(dir1);
        fs.agregarElemento(dir1);
        dir1.agregarElemento(new Archivo("Chau",5));
        dir1.agregarElemento(new Archivo("Alo",10));
        Directorio dir2 = new Directorio("DIR2");
        dir2.agregarElemento(new Archivo("Chau",5));
        dir2.agregarElemento(new Archivo("Alo",10));
    }

    @Test
    void Test() {
        assertEquals(25,fs.archivoMasGrande().getTamaño());
        assertEquals("Hola",fs.archivoMasNuevo().getNombre());
        assertNotNull(fs.buscar("AA"));
        assertNull(fs.buscar("AB"));
        assertNotNull(fs.buscar("DIR1"));
        assertEquals(4,fs.buscarTodos("DIR1").size());
    }
}
