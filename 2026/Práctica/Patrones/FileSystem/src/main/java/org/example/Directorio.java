package org.example;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Directorio extends Elemento {
    private List<Elemento> elementos;

    public Directorio(String nombre) {
        super(nombre);
        this.elementos = new LinkedList<>();
    }

    public List<Elemento> getElementos() {
        return this.elementos;
    }

    @Override
    public int getTamaño() {
        return elementos.stream().mapToInt(Elemento::getTamaño).sum();
    }

    @Override
    public Archivo archivoMasGrande() {
        return elementos.stream()
                .map(Elemento::archivoMasGrande)
                .filter(a -> a != null)
                .max(Comparator.comparingInt(Archivo::getTamaño))
                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return elementos.stream()
                .map(Elemento::archivoMasNuevo)
                .filter(a -> a != null)
                .max(Comparator.comparing(Archivo::getFechaCreacion))
                .orElse(null);
    }

    @Override
    public boolean mismoNombre(String nombre) {
        boolean aux = false;
        if(super.mismoNombre(nombre)) {
            aux = true;
        } else {
            Iterator<Elemento> it = this.elementos.iterator();
            while(it.hasNext() && !aux) {
                aux = it.next().mismoNombre(nombre);
            }
        }
        return aux;
    }

    public void agregarElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }
}
