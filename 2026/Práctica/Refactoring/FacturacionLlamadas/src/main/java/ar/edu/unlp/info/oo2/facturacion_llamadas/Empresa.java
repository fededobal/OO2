package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<>();
	private List<Llamada> llamadas = new ArrayList<>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	public boolean agregarNumeroTelefono(String str) {
		// (1) Move Method: Delegamos la responsabilidad al gestor
		return guia.agregarNumero(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	// (3) DUPLICATED CODE eliminado.
	// Pedimos la instancia ya creada por polimorfismo, consolidamos la lógica.
	public void registrarUsuario(Cliente nuevoCliente) {
		nuevoCliente.setNumeroTelefono(this.obtenerNumeroLibre());
		clientes.add(nuevoCliente);
	}

	// (5) LONG PARAMETER LIST eliminado (Preserve Whole Object)
	// El cliente pasa la llamada ya instanciada (Nacional o Internacional)
	public void registrarLlamada(Cliente origen, Cliente destino, Llamada llamada) {
		llamadas.add(llamada);
		origen.agregarLlamada(llamada);
	}

	// (6) IMPERATIVE LOOP eliminado. Todo el cálculo feo desapareció.
	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}