package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;

public class PromoMedioPago implements Promocion {
    MedioDePago medioDePago;
	
	public PromoMedioPago(MedioDePago medioDePago) {
		super();
		this.medioDePago = medioDePago;
	}

	public double aplicarPromo(OrdenDeCompra ordenDeCompra) {
		return ordenDeCompra.totalDescuentoPromo(medioDePago.getPorcentajeDescuento()) ;
	}

}
