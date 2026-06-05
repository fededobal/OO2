package org.example;

public class EstadoEntrega extends Estado {
    public EstadoEntrega(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void entregar() {
        System.out.println("Su pedido ha sido entregado");
    }
}
