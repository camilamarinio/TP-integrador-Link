package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.*;

@CrossOrigin
@RepositoryRestResource(path = "usuarios")
public interface RepoUsuario extends PagingAndSortingRepository<Usuario, Integer>{

	List<Usuario> findAll();
	Usuario findByNombreAndContrasenia(String nombre,String contrasenia );
	Usuario findByNombre(String nombre);
}
