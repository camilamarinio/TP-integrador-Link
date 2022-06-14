package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
	private List<Item> productos =  new ArrayList<Item>();
	
	
	public void comprar() {
		
	}
    
	public void agregarProductoAlCarrito(Item item) {
		this.productos.add(item);
	}

	public List<Item> getProductos() {
		return productos;
	}

	public void setProductos(List<Item> productos) {
		this.productos = productos;
	}
	

	
	

}
