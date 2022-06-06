package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;

public abstract class MedioDePago {
	private double porcentajeDescuento;

	

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

}
