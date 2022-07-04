package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.CarritoCompras;

@CrossOrigin(origins = "http://localhost:4200" )
@RepositoryRestResource(path = "carrito")
public interface RepoCarrito extends PagingAndSortingRepository<CarritoCompras, Integer>{

	List<CarritoCompras> findAll();
	
}
