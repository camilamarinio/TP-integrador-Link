package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Producto;

public interface RepoProducto extends PagingAndSortingRepository<Producto, Integer> {
	List<Producto> findAll();
	
	
}
