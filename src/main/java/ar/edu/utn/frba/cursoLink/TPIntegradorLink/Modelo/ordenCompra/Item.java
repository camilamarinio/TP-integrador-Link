package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Vendedor;

public class Item {
	private int cantidadProductos;
	private Producto producto;
	
	
	public Item(int cantidadProductos, Producto producto, Vendedor vendedor) {
		
		if(producto.getStock() < cantidadProductos) {
			throw new NoHayStockExeption("No hay suficiontes productos en stock");
		}
		
		this.cantidadProductos = cantidadProductos;
		this.producto = producto;

	}

	public double totalPorProducto() {
		return cantidadProductos * producto.calcularPrecio();
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	



}
