package org.example;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Archivo extends Elemento {
    private int tamaño;
    private LocalDate fechaCreacion;

    public Archivo(String nombre, int tamaño) {
        super(nombre);
        this.tamaño = tamaño;
        this.fechaCreacion = LocalDate.now();
    }

    @Override
    public int getTamaño() {
        return this.tamaño;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}
