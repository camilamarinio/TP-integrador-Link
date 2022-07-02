package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;

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

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Proveedor;

@Entity
@Table(name = "vendedor")
public class Vendedor {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idVendedor;
	private String nombre; 
	private String apellido; 
	@Transient
	private TipoDocumento tipo;
	private int numeroDoc ;
	@OneToMany
	@JoinColumn(name= "idVendedor")
	private List<Proveedor> proveedores =  new ArrayList<Proveedor>();
	
	public Vendedor() {
		super();
		
	}

	public int getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(int numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	@OneToMany
	@JoinColumn(name= "idVendedor")
	private List <Producto> productos = new ArrayList<Producto>();
	
	
	public Vendedor(String nombre, String apellido, TipoDocumento tipo, int numeroDoc) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.numeroDoc = numeroDoc;
	}
	
	public void asociarProveedor(Proveedor proveedor) {
		proveedores.add(proveedor);
	}

	public boolean tieneProveedor(Proveedor proveedor) {
		return proveedores.contains(proveedor);
	}
	
	public void eliminarProducto(Producto producto) throws ProductoNoEncontradoExeption {
		if(productos.contains(producto)) {
			productos.remove(producto);
		}else {
			throw new ProductoNoEncontradoExeption("El producto no se puede eliminar , porque no es un producto del vendedor");
		}
	}
	

	public boolean tenemosProducto (Producto producto) {
		return productos.contains(producto);
	}
	
	public void agregarProducto(Producto producto){
		productos.add(producto);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}


	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	

	public List<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}
	

	
	
	
	
}
