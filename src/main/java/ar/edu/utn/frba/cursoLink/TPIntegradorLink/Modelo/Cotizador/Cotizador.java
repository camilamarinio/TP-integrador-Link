package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador;

public interface Cotizador {
	default double calcularPrecio(double precio) {
		return precio;
	}
}
