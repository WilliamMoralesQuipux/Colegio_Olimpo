package com.colegiohogwarts.app.web.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.colegiohogwarts.app.web.dao.IEstudianteDao;
import com.colegiohogwarts.app.web.modelo.Estudiante;
import com.colegiohogwarts.app.web.service.IEstudianteService;

@Service
public class EstudianteService implements IEstudianteService {

	@Autowired
	private IEstudianteDao estudianteDao;
	
	@Override
	public List<Estudiante> getEstudiantexAsignaturaId(int asignaturaId) {
	
		return estudianteDao.getEstudiantexAsignaturaId(asignaturaId);
	}
	

	

}
