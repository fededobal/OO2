package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<>();
	private String nombre;
	private String numeroTelefono;

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getNumeroTelefono() { return numeroTelefono; }
	public void setNumeroTelefono(String numeroTelefono) { this.numeroTelefono = numeroTelefono; }

	public List<Llamada> getLlamadas() { return llamadas; }
	public void agregarLlamada(Llamada llamada) { this.llamadas.add(llamada); }

	public abstract double aplicarDescuento(double montoBase);

	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream()
				.mapToDouble(Llamada::calcularCostoBase)
				.map(this::aplicarDescuento)
				.sum();
	}
}