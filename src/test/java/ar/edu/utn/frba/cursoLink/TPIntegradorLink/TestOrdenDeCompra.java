package ar.edu.utn.frba.cursoLink.TPIntegradorLink;

import static org.junit.jupiter.api.Assertions.assertEquals; 


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador.CotizadorPesos;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.CuponProveedores;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.MedioDePago;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.Membresia;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.PromoMedioPago;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones.Promocion;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Cliente;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.TipoDocumento;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Vendedor;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Item;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.NoHayStockExeption;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Proveedor;





public class TestOrdenDeCompra {
	
	Cliente camila = new Cliente("camila" , "marinio" ,TipoDocumento.DNI,41740721);
	
	
	OrdenDeCompra orden1 = new OrdenDeCompra(camila);
	OrdenDeCompra orden2 = new OrdenDeCompra(camila);
	
	Producto producto1 = new Producto(1000,10);
	Producto producto2 = new Producto(1000,7);
	
	Vendedor vendedor1 = new Vendedor("juan" , "perez" , TipoDocumento.DNI , 7589372);

	
	Item item1 = new Item(3 , producto1 ,vendedor1);
	Item item2 = new Item(2, producto2, vendedor1);
	
	Producto productoDist = new Producto(200, 40);
	Item itemDist = new Item(5, productoDist, vendedor1);
	
	Proveedor proveedor = new Proveedor("Arcor");
	Proveedor proveedorF = new Proveedor("Felfor");
	
	List <Cliente> miembrosClientes = Arrays.asList(camila);
	Promocion promoMembre1 = new Membresia(miembrosClientes,0.2);
	
	Promocion promoEfectivo = new PromoMedioPago(new MedioDePago(0.4));
	Promocion promoTarjeta = new PromoMedioPago(new MedioDePago(0.1));
	
	//tengo que ver la fecha actual porque sino no me funciona el test
	Promocion cuponProveedores = new CuponProveedores(proveedor , 0.3 , LocalDate.of(2023, 6, 15) );
	Promocion cuponProveedoresVencido = new CuponProveedores(proveedor , 0.3 , LocalDate.of(2021, 6, 9) );
	Promocion cuponProveedoresDif = new CuponProveedores(proveedorF , 0.2 , LocalDate.of(2023, 6, 15) );
	@BeforeEach
	void cargarOrden1() {
		orden1.agregarItem(item1);
		orden1.agregarItem(item2);
		orden1.setVendedor(vendedor1);
	}
	
	@BeforeEach
	void cargarOrden2() {
		Item item1 = new Item(6 , producto1 ,vendedor1);
		Item item2 = new Item(1, producto2, vendedor1);
		orden2.agregarItem(item1);
		orden2.agregarItem(item2);
		orden2.setVendedor(vendedor1);
	}
	

	
	@BeforeEach
	void cargarProductosdelProveedor() {
		proveedor.agregarProducto(producto1);
		proveedor.agregarProducto(producto2);
		proveedorF.agregarProducto(productoDist);
	}
	
	@BeforeEach 
	
	void cargarProveedores() {
		
		vendedor1.asociarProveedor(proveedor);
		vendedor1.asociarProveedor(proveedorF);
	}
	
	 
	@Test 
	public void NoPuedoCrearUnItemSiNoTengoStockSuficienteDelProducto() {
		Producto producto0 = new Producto (1000, 1);
		
		Assertions.assertThrows(NoHayStockExeption.class,() -> new Item(20, producto0 , vendedor1));
	}
	
	@Test 
	public void calculoTotalDeLaOrdenConPromos() {	
		cargarPromos();
		
		assertEquals(2000, orden1.totalOrdenConPromo());
	}
	

	@Test
	public void NoSeAplicanDescuentosDeMEnbresiaSiElClienteNoEsMiembro() {
		List<Cliente>clientes= new ArrayList<Cliente>();
		
		Promocion promoMembre = new Membresia(clientes,0.2);
		orden1.agregarPromo(promoMembre);
		
		assertEquals(5000, orden1.totalOrdenConPromo());
	}
	
	@Test
	public void SeAplicaDescuentosDeMembresiaSiElClienteEsMiembro() {
		
		orden1.agregarPromo(promoMembre1);
		
		assertEquals(4000, orden1.totalOrdenConPromo());
	}
	
	@Test
	public void SeAplicaDescuentoSiMedioDePagoEnEfectivo() {
		
		orden1.agregarPromo(promoEfectivo);
		
		assertEquals(3000, orden1.totalOrdenConPromo());
	}
	
	@Test
	public void SeAplicaDescuentoConMedioDePagoTarjeta() {
		
		orden2.agregarPromo(promoTarjeta);
		
		assertEquals(6300, orden2.totalOrdenConPromo());
	}
	
	@Test
	public void SeAplicaDescuentoCuponProveedores() {
		
		orden2.agregarPromo(cuponProveedores);
		
		assertEquals(4900, orden2.totalOrdenConPromo());
	}
	
	@Test
	public void SeAplicaDescuentoCuponProveedoresEnSoloLosProductosDeEseProveedor() {
		
		orden2.agregarItem(itemDist);
		orden2.agregarPromo(cuponProveedoresDif);
		
		assertEquals(7800, orden2.totalOrdenConPromo());
	}
	
	@Test
	public void NoSeAplicaDescuentoCuponProveedoresSiEstaVencido() {
		
		orden2.agregarPromo(cuponProveedoresVencido);
		
		assertEquals(7000, orden2.totalOrdenConPromo());
	}
	
	@Test
	public void CalculoTotalDeOrdenDeCompraSinNingunaPromo() {
		
		assertEquals(7000, orden2.totalOrdenConPromo());
	}
	

	void cargarPromos() {
		orden1.agregarPromo(promoEfectivo);
		orden1.agregarPromo(promoMembre1);
	}
	
}
