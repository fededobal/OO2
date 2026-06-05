package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	protected int duracion; // protected para que las subclases accedan fácil

	public Llamada(String origen, String destino, int duracion) {
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
	}

	public String getOrigen() { return origen; }
	public String getDestino() { return destino; }
	public int getDuracion() { return duracion; }

	// (4) COMMENTS y (2) SWITCH STATEMENTS eliminados.
	// Cada subclase sabe cómo calcular su propio costo.
	public abstract double calcularCostoBase();
}