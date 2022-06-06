package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;

public interface Promocion {

	public double aplicarPromo (OrdenDeCompra ordenDeCompra);
}
