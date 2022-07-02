package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Vendedor; 

@Entity
@Table(name = "item")
public class Item {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idItem; 
	
	private int cantidadProductos;
	@OneToOne
	@JoinColumn(name= "idItem")
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


	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Producto getProducto() {
		return this.producto;
	}

	



}
