package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;

@CrossOrigin(origins = "http://localhost:4200" )
@RepositoryRestResource(path = "ordenDeCompra")
public interface RepoOrdenDeCompra extends PagingAndSortingRepository<OrdenDeCompra, Integer>{

	
}
