package com.colegiohogwarts.app.web.dao;

import java.util.List;
import com.colegiohogwarts.app.web.modelo.Estudiante;

public interface IEstudianteDao {

	public List<Estudiante> getEstudiantexAsignaturaId(int idAsignatura);	
	
}
