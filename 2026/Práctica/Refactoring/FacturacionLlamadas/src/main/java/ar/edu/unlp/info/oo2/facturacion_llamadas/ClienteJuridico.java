package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {
	private String cuit;

	public String getCuit() { return cuit; }
	public void setCuit(String cuit) { this.cuit = cuit; }

	@Override
	public double aplicarDescuento(double montoBase) {
		return montoBase - (montoBase * 0.15);
	}
}