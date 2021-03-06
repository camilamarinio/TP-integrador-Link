package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios.Usuario;
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestController
public class ControllerUsuario {
	
@Autowired
RepoUsuario repoUsuario;

@RequestMapping(method = RequestMethod.GET , value = "usuarios/{nombre}/agregar")
public @ResponseBody Usuario getUsuario (@PathVariable("nombre") String nombre) {
	
	Usuario usuario = repoUsuario.findByNombre(nombre);

	return repoUsuario.findByNombreAndContrasenia(usuario.getNombre(),usuario.getContrasenia());
	
}

}
