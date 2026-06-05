package org.example;

public abstract class Estado {
    private Pedido contexto;

    public Estado(Pedido contexto) {
        this.contexto = contexto;
    }
    public Pedido getContexto() {
        return this.contexto;
    }
    public void agregarProducto(IProducto producto) {
        System.out.println("No se puede modificar el pedido en este estado");
    }
    public void cancelar() {
        System.out.println("No se puede cancelar el pedido en este estado");;
    }
    public void pagar() {
        System.out.println("No se puede pagar el pedido en este estado");
    }
    public void finalizarPreparacion() {
        System.out.println("No se puede finalizar el pedido en este estado");
    }
    public void entregar() {
        System.out.println("No se puede entregar el pedido en este estado");
    }
    public void setMetodoPago(MetodoPago metodoPago) {
        System.out.println("No se puede cambiar el método de pago en este estado");
    }
}
