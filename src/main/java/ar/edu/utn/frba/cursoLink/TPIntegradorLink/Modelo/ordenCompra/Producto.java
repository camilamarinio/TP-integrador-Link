package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador.Cotizador;

public class Producto {
	private double precio;
	private int stock;
	private Cotizador cotizador;
	
	

	public Producto(double precio, Cotizador cotizador, int stock ) {
		this.precio = precio;
		this.cotizador = cotizador;
		this.stock = stock;
	}


	public double calcularPrecio() {
		return cotizador.calcularPrecio(precio);
	}


	public int getStock() {
		return this.stock;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Cotizador getCotizador() {
		return cotizador;
	}


	public void setCotizador(Cotizador cotizador) {
		this.cotizador = cotizador;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

	

}
