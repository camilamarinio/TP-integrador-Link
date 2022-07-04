package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

import java.time.LocalDate;  
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.MedioDePago;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.Promocion;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Cliente;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Vendedor;

@Entity
@Table(name = "ordenDeCompra")
public class OrdenDeCompra {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idOrden;
	
	@OneToMany
	@JoinColumn(name= "idOrden")
	private List<Item> productos = new ArrayList<Item>();
	
	@OneToMany
	@JoinColumn(name= "idOrden")
	private List<Promocion> promos =  new ArrayList<Promocion>();
	
	@ManyToOne
	private Cliente cliente;
	
	private LocalDate fechaOrden;
	
	@ManyToOne
	private Vendedor vendedor;
	@OneToOne
	private MedioDePago medioPago;
	
	
	
	public OrdenDeCompra() {
		super();
		
	}

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

	public List<Item> getProductos() {
		return productos;
	}

	public void setProductos(List<Item> productos) {
		this.productos = productos;
	}

	public List<Promocion> getPromos() {
		return promos;
	}

	public void setPromos(List<Promocion> promos) {
		this.promos = promos;
	}

	public MedioDePago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MedioDePago medioPago) {
		this.medioPago = medioPago;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setFechaOrden(LocalDate fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
	

	

}
