package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
    public LlamadaInternacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    public double calcularCostoBase() {
        return (duracion * 150) + (duracion * 150 * 0.21) + 50;
    }
}