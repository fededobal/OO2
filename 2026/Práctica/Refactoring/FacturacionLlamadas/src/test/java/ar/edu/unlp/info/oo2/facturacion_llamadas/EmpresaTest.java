package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;

	@BeforeEach
	public void setUp() {
		this.sistema = new Empresa();
		this.sistema.agregarNumeroTelefono("2214444554");
		this.sistema.agregarNumeroTelefono("2214444555");
		this.sistema.agregarNumeroTelefono("2214444556");
		this.sistema.agregarNumeroTelefono("2214444557");
		this.sistema.agregarNumeroTelefono("2214444558");
		this.sistema.agregarNumeroTelefono("2214444559");
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		ClienteFisico emisorPersonaFisca = new ClienteFisico();
		emisorPersonaFisca.setNombre("Brendan Eich");
		emisorPersonaFisca.setDNI("11555666");
		sistema.registrarUsuario(emisorPersonaFisca);

		ClienteFisico remitentePersonaFisica = new ClienteFisico();
		remitentePersonaFisica.setNombre("Doug Lea");
		remitentePersonaFisica.setDNI("00000001");
		sistema.registrarUsuario(remitentePersonaFisica);

		ClienteJuridico emisorPersonaJuridica = new ClienteJuridico();
		emisorPersonaJuridica.setNombre("Nvidia Corp");
		emisorPersonaJuridica.setCuit("17555222");
		sistema.registrarUsuario(emisorPersonaJuridica);

		ClienteJuridico remitentePersonaJuridica = new ClienteJuridico();
		remitentePersonaJuridica.setNombre("Sun Microsystems");
		remitentePersonaJuridica.setCuit("25765432");
		sistema.registrarUsuario(remitentePersonaJuridica);

		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica,
				new LlamadaNacional(emisorPersonaJuridica.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 10));
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica,
				new LlamadaInternacional(emisorPersonaJuridica.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 8));
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica,
				new LlamadaNacional(emisorPersonaJuridica.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 5));
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica,
				new LlamadaInternacional(emisorPersonaJuridica.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 7));

		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica,
				new LlamadaNacional(emisorPersonaFisca.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 15));
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica,
				new LlamadaInternacional(emisorPersonaFisca.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 45));
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica,
				new LlamadaNacional(emisorPersonaFisca.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 13));
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica,
				new LlamadaInternacional(emisorPersonaFisca.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 17));

		assertEquals(11454.64, this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 0.01);
		assertEquals(2445.40, this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 0.01);
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica));
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica));
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.sistema.agregarNumeroTelefono("2214444558");

		ClienteFisico nuevaPersona = new ClienteFisico();
		nuevaPersona.setNombre("Alan Turing");
		nuevaPersona.setDNI("2444555");
		this.sistema.registrarUsuario(nuevaPersona);

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		assertEquals("2214444559", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().setEstrategiaGenerador(new EstrategiaPrimero());
		assertEquals("2214444554", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().setEstrategiaGenerador(new EstrategiaRandom());
		assertNotNull(this.sistema.obtenerNumeroLibre());
	}
}