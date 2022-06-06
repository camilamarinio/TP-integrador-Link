package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;
import java.time.LocalDate;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Proveedor;

public class CuponProveedores implements Promocion {
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

}
