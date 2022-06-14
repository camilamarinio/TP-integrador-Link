package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import java.time.LocalDate; 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.Promocion;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Cliente;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Vendedor;

public class OrdenDeCompra {
	private List<Item> productos = new ArrayList<Item>();
	private List<Promocion> promos =  new ArrayList<Promocion>();
	private Cliente cliente;
	private LocalDate fechaOrden;
	private Vendedor vendedor;
	
	public OrdenDeCompra(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.fechaOrden = LocalDate.now();
	}

	public double totalOrdenConPromo() {
		return totalOrdenSinPromo() - totalDescuentosPromos();
	} 
	
	public double totalDescuentosPromos() {
		
		return promos.stream().mapToDouble(promo -> promo.aplicarPromo(this)).sum();
	}
	
	public void agregarItem(Item item) {
		productos.add(item);
		}
	
	public void agregarPromo(Promocion promo) {
		promos.add(promo);
	}


	public double totalOrdenSinPromo() {
		return productos.stream().
				mapToDouble(item  -> item.totalPorProducto()).sum();
	
	}
	
	public double totalDescuentoPromo(double descuento) {
		return  descuento * this.totalOrdenSinPromo();
	}

	
	public Stream<Item> productosDeProveedor(Proveedor proveedor){
		return productos.stream().filter(item -> proveedor.tieneProducto(item));
	}
	
	
	public double totalProveedorSinPromo(Proveedor proveedor) {
		return this.productosDeProveedor(proveedor).
				mapToDouble(item  -> item.totalPorProducto()).sum();
	}
	
	public double totalProveedorDescuentoPromo(Proveedor proveedor,double descuento) {
		return  descuento * totalProveedorSinPromo(proveedor);
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
		
	}

	public LocalDate getFechaOrden() {
		return this.fechaOrden;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	

	

}
