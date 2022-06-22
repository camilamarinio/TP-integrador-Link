package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;


class Usuario {
	String nombreUsuario;
	String contrasenia;
	int minimosCaracPermitidos;
	int maximosCaracPermitidos;
	Rol rol;
	
	public boolean ValidarContrasenia() {
		return contrasenia.length() >= minimosCaracPermitidos && contrasenia.length() <= maximosCaracPermitidos;
	}
	
	

}
