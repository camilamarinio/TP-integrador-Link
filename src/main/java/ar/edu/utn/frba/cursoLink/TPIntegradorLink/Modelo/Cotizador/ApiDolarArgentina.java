package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador;


public class ApiDolarArgentina {
	private String fecha;
	private String valorCompra;
	private String ValorVenta;
	
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}

	public void setValorVenta(String valorVenta) {
		ValorVenta = valorVenta;
	}

	public String getValorCompra() {
		return valorCompra;
	}

	public String getValorVenta() {
		return ValorVenta;
	}

	

}
