package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class CarritoCompras {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCarrito;
	
	@OneToMany
	@JoinColumn(name= "idCarrito")
	private List<Item> productos =  new ArrayList<Item>();
	
	
	
    
	public CarritoCompras() {
		super();
		
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
