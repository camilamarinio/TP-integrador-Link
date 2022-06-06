package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador;

import java.time.LocalDate;

public class ApiCalcularDolar {
	LocalDate fecha;
	double valorCompra= 1;
	double ValorVenta;
	
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public double getValorVenta() {
		return ValorVenta;
	}
	public void setValorVenta(double valorVenta) {
		ValorVenta = valorVenta;
	}

}
