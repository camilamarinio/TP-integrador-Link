package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Proveedor;

public class Vendedor {
	private String nombre; 
	private String apellido; 
	private TipoDocumento tipo;
	private int numeroDoc ;
	private List<Proveedor> proveedores =  new ArrayList<Proveedor>();
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
