package org.example;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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

    public void agregarElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public Elemento buscar(String nombre) {
        if (this.mismoNombre(nombre)) {
            return this;
        }
        return elementos.stream()
                .map(e -> e.buscar(nombre))
                .filter(e -> e != null)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Elemento> buscarTodos(String nombre) {
        List<Elemento> res = new LinkedList<>();
        if (this.mismoNombre(nombre)) {
            res.add(this);
        }
        List<Elemento> resultadosDeHijos = elementos.stream()
                .flatMap(e -> e.buscarTodos(nombre).stream())
                .collect(Collectors.toList());

        res.addAll(resultadosDeHijos);
        return res;
    }

    @Override
    String listarElementos(String rutaPadre) {
        String miRuta = rutaPadre.equals("/") ? "/" + this.getNombre() : rutaPadre + "/" + this.getNombre();
        String resultado = miRuta + "\n";
        resultado += this.elementos.stream()
                .map(e -> e.listarElementos(miRuta))
                .collect(Collectors.joining());
        return resultado;
    }
}
