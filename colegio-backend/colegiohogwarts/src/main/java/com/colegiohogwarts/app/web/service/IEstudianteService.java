package com.colegiohogwarts.app.web.service;
import java.util.List;
import com.colegiohogwarts.app.web.modelo.Estudiante;

public interface IEstudianteService {

public List<Estudiante> getEstudiantexAsignaturaId(int asignaturaId);
	
}
