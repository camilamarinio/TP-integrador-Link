package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador;

public class CotizadorDolares implements Cotizador{
	ApiCalcularDolar api;

	public double calcularPrecio(double precio) {
		return api.getValorCompra() * precio;
	}

}
