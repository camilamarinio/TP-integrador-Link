package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;
import java.time.LocalDate;

import javax.persistence.OneToOne;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Proveedor;

public class CuponProveedores extends Promocion {
	@OneToOne
	private Proveedor proveedor;
	private double porcentajeDescuento;
	private LocalDate fechaTermino;

	public CuponProveedores(Proveedor proveedor, double porcentajeDescuento, LocalDate fechaTermino) {
		super();
		this.proveedor = proveedor;
		this.porcentajeDescuento = porcentajeDescuento;
		this.fechaTermino = fechaTermino;
	}

	public double aplicarPromo(OrdenDeCompra ordenDeCompra) {
		
		if(ordenDeCompra.getFechaOrden().isBefore(this.fechaTermino)) {
			
			return ordenDeCompra.totalProveedorDescuentoPromo(proveedor,porcentajeDescuento);
		
		} else {
			
			return 0;
		}
		
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public LocalDate getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(LocalDate fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	
	

}
