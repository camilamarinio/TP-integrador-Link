package ar.edu.utn.frba.cursoLink.TPIntegradorLink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app.RepoProducto;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;

@SpringBootApplication
public class TpIntegradorLinkApplication {
	
	@Autowired
	RepoProducto repoProducto;

	public static void main(String[] args) {
		SpringApplication.run(TpIntegradorLinkApplication.class, args);
	
	}

}
