package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.CarritoCompras;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;

@RepositoryRestController
public class CarritoController {
	@Autowired
	RepoCarrito repoCarrito;
/*
	@GetMapping("")
	public List<CarritoCompras> getProductos(){
		return repoCarrito.findAll();
	}
	
	
	@PostMapping("")
	public String setProducto(@RequestBody CarritoCompras producto){
		repoCarrito.save(producto);
		return "ok" ;
	}
	
*/
}
