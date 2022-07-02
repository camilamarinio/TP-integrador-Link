package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUsuario;
	String nombreUsuario;
	String contrasenia;
	int minimosCaracPermitidos;
	int maximosCaracPermitidos;
	@OneToOne
	Rol rol;
	
	public boolean ValidarContrasenia() {
		return contrasenia.length() >= minimosCaracPermitidos && contrasenia.length() <= maximosCaracPermitidos;
	}
	
	

}
