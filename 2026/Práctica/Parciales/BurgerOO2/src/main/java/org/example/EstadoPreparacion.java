package org.example;

public class EstadoPreparacion extends Estado {
    public EstadoPreparacion(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void cancelar() {
        this.getContexto().setPenalizacion(this.getContexto().getPrecioProductos() * 0.2);
    }

    @Override
    public void finalizarPreparacion() {
        this.getContexto().setEstado(new EstadoEntrega(this.getContexto()));
    }
}
