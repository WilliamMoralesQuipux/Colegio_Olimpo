package com.colegiohogwarts.app.web.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.colegiohogwarts.app.web.dao.IProfesorDao;
import com.colegiohogwarts.app.web.modelo.Profesor;

@Repository
public class ProfesorDao implements IProfesorDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public ArrayList<Profesor> getListaProfesores() {

		try {
			String sql = "SELECT * FROM PROFESOR";
			ArrayList<Profesor> profesores = (ArrayList<Profesor>) template.query(sql,
					new BeanPropertyRowMapper<Profesor>(Profesor.class));
			return profesores;
		}catch (Exception e) {
		    System.out.println ("El error es: " + e.getMessage());
		    e.printStackTrace();
			return null;
		}
		
		
	}

}
