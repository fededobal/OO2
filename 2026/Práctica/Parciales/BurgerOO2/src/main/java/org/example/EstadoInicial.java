package org.example;

public class EstadoInicial extends Estado {
    private MetodoPago metodoPago;

    public EstadoInicial(Pedido pedido, MetodoPago metodoPago) {
        super(pedido);
        this.metodoPago = metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public void agregarProducto(IProducto producto) {
        this.getContexto().getProductos().add(producto);
    }

    @Override
    public void cancelar() {
        this.getContexto().vaciarProductos();
    }

    @Override
    public void pagar() {
        System.out.println("Usted debe abonar: $" + this.metodoPago.getMontoAPagar(this.getContexto().getPrecio()));
        this.getContexto().setEstado(new EstadoPreparacion(this.getContexto()));
    }
}
