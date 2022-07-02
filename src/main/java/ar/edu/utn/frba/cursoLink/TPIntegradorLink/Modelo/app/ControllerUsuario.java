package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.app;


import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario {
	
	@GetMapping("")
	public String get() {
		return "login";
	}

}
