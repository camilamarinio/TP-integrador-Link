package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;
@Entity
@Table(name = "PromoMedioPago")
public class PromoMedioPago extends Promocion {
	@OneToOne
    MedioDePago medioDePago;
	
	public PromoMedioPago(MedioDePago medioDePago) {
		super();
		this.medioDePago = medioDePago;
	}

	public double aplicarPromo(OrdenDeCompra ordenDeCompra) {
		return ordenDeCompra.totalDescuentoPromo(medioDePago.getPorcentajeDescuento()) ;
	}

}
