package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra;

public class NoHayStockExeption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoHayStockExeption(String s ) {
		super(s);
	}
}
