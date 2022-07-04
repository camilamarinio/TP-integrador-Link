package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;

@Entity
@Table(name = "promocion")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Promocion {
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private Integer idPromo;

	public double aplicarPromo (OrdenDeCompra ordenDeCompra) {
		return 0;
	}
}
