package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
class Administrador {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idAdmin; 

	private String nombre;
	private String Apellido;
	
		public Administrador() {
		super();
	
	}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return Apellido;
		}

		public void setApellido(String apellido) {
			Apellido = apellido;
		}
		
		

}
