package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;


import java.util.ArrayList; 
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.CarritoCompras;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Item;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;


@Entity
@Table(name = "cliente")
public class Cliente {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCliente; 
	private String nombre;
	private String apellido ;
	@Transient
	private TipoDocumento tipo;
	private int numeroDocumento;
	
	@OneToMany(mappedBy= "cliente")
	private List<OrdenDeCompra> compras = new ArrayList<OrdenDeCompra>();
	@OneToOne
	private CarritoCompras carritoCompras;
	
	
	public Cliente(String nombre, String apellido, TipoDocumento tipo, int numero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.numeroDocumento = numero;
	}


	public Cliente() {
		super();
		
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


	public int getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public List<OrdenDeCompra> getCompras() {
		return compras;
	}


	public void setCompras(List<OrdenDeCompra> compras) {
		this.compras = compras;
	}


	public CarritoCompras getCarritoCompras() {
		return carritoCompras;
	}


	public void setCarritoCompras(CarritoCompras carritoCompras) {
		this.carritoCompras = carritoCompras;
	}


	public void cargarOrdenDeCompra(OrdenDeCompra orden) {
		compras.add(orden);
	}
	
	public void agregarProductoAlCarrito(Item item) {
		carritoCompras.agregarProductoAlCarrito(item);
	}
	

	
}
