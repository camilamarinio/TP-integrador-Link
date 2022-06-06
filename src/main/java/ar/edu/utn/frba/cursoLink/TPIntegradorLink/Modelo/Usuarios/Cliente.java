package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;


import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.CarritoCompras;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Item;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;

public class Cliente {
	private String nombre;
	private String apellido ;
	private TipoDocumento tipo;
	private int numeroDocumento;
	private List<OrdenDeCompra> compras = new ArrayList<OrdenDeCompra>();
	private CarritoCompras carritoCompras;
	
	
	public Cliente(String nombre, String apellido, TipoDocumento tipo, int numero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.numeroDocumento = numero;
	}


	public void generarOrdenDeCompra(OrdenDeCompra orden) {
		compras.add(orden);
	}
	
	public void agregarProductoAlCarrito(Item item) {
		carritoCompras.agregarProductoAlCarrito(item);
	}
	
	public void comprarCarrito() {
		carritoCompras.comprar();
	}
	
	
}
