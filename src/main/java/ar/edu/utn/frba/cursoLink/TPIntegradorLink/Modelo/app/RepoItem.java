package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.ordenCompra.Item;

public interface RepoItem extends CrudRepository<Item, Integer> {
	
	List<Item> findAll();
	
	
	

}
