package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
	private String nombre;
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	
	public Proveedor(String nombre) {
		super();
		this.nombre = nombre;
	}



	public boolean tieneProducto(Item item) {
		return productos.contains(item.getProducto());
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<Producto> getProductos() {
		return productos;
	}



	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
