package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Cotizador.CotizadorPesos;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	RepoProducto repo;
	

	@GetMapping("")
	public List<Producto> getProductos(){
		return repo.findAll();
	}

	
	@PostMapping("")
	public String setProducto(@RequestBody Producto producto){
		repo.save(producto);
		return "ok" ;
	}
	

	

}
