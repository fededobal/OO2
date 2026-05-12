package org.example;

import java.util.Collection;
import java.util.List;

public abstract class Elemento {
    private String nombre;

    abstract int getTamaño();
    abstract Archivo archivoMasGrande();
    abstract Archivo archivoMasNuevo();
    abstract Elemento buscar(String nombre);
    abstract List<Elemento> buscarTodos(String nombre);
    abstract String listarElementos(String ruta);

    public Elemento(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public boolean mismoNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
}
