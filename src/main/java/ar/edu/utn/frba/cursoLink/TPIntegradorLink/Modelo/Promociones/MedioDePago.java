package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medioDePago")

public class MedioDePago {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idMedioPago;
	private double porcentajeDescuento;

	public MedioDePago(double porcentajeDescuento) {
		super();
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	
	
}
