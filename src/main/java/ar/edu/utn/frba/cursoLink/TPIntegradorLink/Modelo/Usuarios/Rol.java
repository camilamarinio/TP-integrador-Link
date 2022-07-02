package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
abstract class Rol {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idRol;
}
