package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.OrdenDeCompra;
import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;

@CrossOrigin(origins = "http://localhost:4200" )
@RepositoryRestResource(path = "ordenDeCompra")
public interface RepoOrdenDeCompra extends PagingAndSortingRepository<OrdenDeCompra, Integer>{


}
