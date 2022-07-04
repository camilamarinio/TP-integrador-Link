package ar.edu.utn.frba.cursoLink.TPIntegradorLink.Modelo.Usuarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Rol {
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private Integer idRol;
}
