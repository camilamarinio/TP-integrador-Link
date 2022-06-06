package ar.edu.utn.frba.cursoLink.TPIntegradorLink.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/usuario")
public class ControllerUsuario {
	
	@GetMapping("/{nombre}")
	public String get(@PathVariable ("nombre") String nombreDe) {
		return "login";
	}

}
