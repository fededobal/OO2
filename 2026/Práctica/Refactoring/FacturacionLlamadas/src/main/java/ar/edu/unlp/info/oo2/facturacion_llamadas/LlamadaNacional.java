package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {
    public LlamadaNacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    public double calcularCostoBase() {
        return (duracion * 3) + (duracion * 3 * 0.21);
    }
}