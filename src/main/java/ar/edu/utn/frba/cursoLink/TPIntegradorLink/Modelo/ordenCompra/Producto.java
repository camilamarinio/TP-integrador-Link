package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

 
import javax.persistence.Entity;   
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "productos")
public class Producto {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProducto;

	private String nombre;
	private double precio;
	private String descripcion;
	private String imagen;
	private int stock;
	
	
	public Producto() {
		super();
	}
	
	


	public Producto(String nombre, double precio, String descripcion, String imagen, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.stock = stock;
	}




	public double calcularPrecio() {
		return precio;
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


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public Integer getIdProducto() {
		return idProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}
