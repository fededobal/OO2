package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<>();
	private GeneradorNumero generador = new EstrategiaUltimo();

	public boolean agregarNumero(String str) {
		if (!lineas.contains(str)) {
			lineas.add(str);
			return true;
		}
		return false;
	}

	public String obtenerNumeroLibre() {
		if (lineas.isEmpty()) return null;
		return generador.obtener(lineas);
	}

	public void setEstrategiaGenerador(GeneradorNumero generador) {
		this.generador = generador;
	}
}