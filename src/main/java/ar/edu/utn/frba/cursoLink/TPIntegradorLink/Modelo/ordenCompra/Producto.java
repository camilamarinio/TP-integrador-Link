package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador.Cotizador;

public class Producto {
	private double precio;
	private Cotizador cotizador;
	private int stock;
	

	public Producto(double precio, Cotizador cotizador, int stock ) {
		this.precio = precio;
		this.cotizador = cotizador;
		this.stock = stock;
	}


	public double calcularPrecio() {
		return cotizador.calcularPrecio(precio);
	}
	
	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}
	public Cotizador getCotizador() {
		return cotizador;
	}
	

}
