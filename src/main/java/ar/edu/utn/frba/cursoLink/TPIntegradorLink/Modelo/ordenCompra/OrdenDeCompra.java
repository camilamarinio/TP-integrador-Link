package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.MedioDePago;
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
	
	public LocalDate getFechaOrden() {
		return fechaOrden;
	}

	public List<Item> getProductos() {
		return productos;
	}

	public void setProductos(List<Item> productos) {
		this.productos = productos;
	}

	public List<Promocion> getPromo() {
		return promos;
	}

	public void setPromo(List<Promocion> promo) {
		this.promos = promo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	

}
