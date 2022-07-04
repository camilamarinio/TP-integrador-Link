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
	
	public void cargaProductos() {
		repoProducto.save(new Producto("Motorola G51",50000.0,"128 GB , 4GB RAM , 3 camaras","https://olmoshogar.com.ar/wp-content/uploads/2022/05/CELU-MOTO-G51-DORADO.jpg",10 ));
	}
	
	

}
