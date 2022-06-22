package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;




import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador.Cotizador;

@Entity
@Table(name = "productos")
public class Producto {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProducto;
	
	@Transient
	private double precio;
	@Transient
	private int stock;
	@Transient
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
