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
import javax.persistence.Transient;

@Entity
@Table(name = "proveedor")
public class Proveedor {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProveedor; 
	private String nombre;
	@OneToMany
	@JoinColumn(name= "idProveedor")
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
