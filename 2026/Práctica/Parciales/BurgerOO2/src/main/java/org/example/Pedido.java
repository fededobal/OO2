package org.example;

import java.util.LinkedList;
import java.util.List;

public class Pedido {
    private Estado estado;
    private List<IProducto> productos;
    private double penalizacion;

    public Pedido() {
        this.estado = new EstadoInicial(this,new MetodoEfectivo());
        this.productos = new LinkedList<>();
        this.penalizacion = 0;
    }

    public void agregarProducto(IProducto producto) {
        this.estado.agregarProducto(producto);
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.estado.setMetodoPago(metodoPago);
    }

    public List<IProducto> getProductos() {
        return this.productos;
    }

    public void vaciarProductos() {
        this.productos = new LinkedList<>();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setPenalizacion(double penalizacion) {
        this.penalizacion = penalizacion;
    }

    public double getPrecio() {
        return this.getPrecioProductos() + this.penalizacion;
    }

    public double getPrecioProductos() {
        return this.productos.stream().mapToDouble((IProducto::getPrecio)).sum();
    }

    public void cancelar() {
        this.estado.cancelar();
    }
    public void pagar() {
        this.estado.pagar();
    }
    public void finalizarPreparacion() {
        this.estado.finalizarPreparacion();
    }
    public void entregar() {
        this.estado.entregar();
    }
}
