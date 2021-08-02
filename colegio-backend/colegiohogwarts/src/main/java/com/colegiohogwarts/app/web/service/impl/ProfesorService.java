package com.colegiohogwarts.app.web.service.impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.colegiohogwarts.app.web.dao.IProfesorDao;
import com.colegiohogwarts.app.web.modelo.Profesor;
import com.colegiohogwarts.app.web.service.IProfesorService;

@Service
public class ProfesorService implements IProfesorService {

	@Autowired
	IProfesorDao profesorDao;
	
	@Override
	public ArrayList<Profesor> getListaProfesores() {
		
		return	profesorDao.getListaProfesores();
	}

}
