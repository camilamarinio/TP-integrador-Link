package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Promociones;

import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Cliente;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;

public class Membresia implements Promocion {
	private List<Cliente> clientesAsociados = new ArrayList<Cliente>();
	private double descuento;
	


	public Membresia(List<Cliente> clientesAsociados, double descuento) {
		super();
		this.clientesAsociados = clientesAsociados;
		this.descuento = descuento;
	}



	public double aplicarPromo(OrdenDeCompra orden)  {
		if(clientesAsociados.contains(orden.getCliente())) {
				return orden.totalDescuentoPromo(descuento);
			} else {
				return 0;
			}
		
		//ver tema exepcion si el cliente no esta en la lista
	}
	

}
