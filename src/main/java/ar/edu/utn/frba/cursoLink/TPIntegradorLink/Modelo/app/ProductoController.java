package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;

@RepositoryRestController
public class ProductoController {
	
	@Autowired
	RepoProducto repoProducto;
	
	@RequestMapping(method = RequestMethod.POST , value= "/producto/{producto}/agregar")
	public @ResponseBody String agregarProducto(@PathVariable("producto") Producto productoId) {
		
		
		return "ok";
	}

	

}
