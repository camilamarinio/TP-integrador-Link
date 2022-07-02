package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;

@Entity
@Table(name = "promocion")
public abstract class Promocion {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPromo;

	public double aplicarPromo (OrdenDeCompra ordenDeCompra) {
		return 0;
	}
}
