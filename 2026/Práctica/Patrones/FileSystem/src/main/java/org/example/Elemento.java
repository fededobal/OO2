package org.example;

import java.util.Collection;
import java.util.List;

public abstract class Elemento {
    private String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    abstract int getTamaño();

    abstract Archivo archivoMasGrande();

    abstract Archivo archivoMasNuevo();

    public boolean mismoNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
}
