package com.colegiohogwarts.app.web.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.colegiohogwarts.app.web.dao.IAsignaturaDao;
import com.colegiohogwarts.app.web.modelo.Asignatura;

@Repository
public class AsignaturaDao implements IAsignaturaDao {
	
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public ArrayList<Asignatura> getAsiganturas(int idProfesor) {

		try {
			String sql = "SELECT  ASIGNATURA.IDASIGNATURA , ASIGNATURA.NOMBREASIGNATURA   FROM PROFESORXASIGNATURA " + 
					"INNER JOIN PROFESOR  ON PROFESOR.IDPROFESOR  = PROFESORXASIGNATURA .IDPROFESOR " + 
					"INNER JOIN  ASIGNATURA  ON ASIGNATURA.IDASIGNATURA  = PROFESORXASIGNATURA.IDASIGNATURA " + 
					"WHERE PROFESOR.IDPROFESOR  = "+idProfesor;
			ArrayList<Asignatura> asignaturas = (ArrayList<Asignatura>) template.query(sql,
					new BeanPropertyRowMapper<Asignatura>(Asignatura.class));
			return asignaturas;
		}catch (Exception e) {
		    System.out.println ("El error es: " + e.getMessage());
		    e.printStackTrace();
			return null;
		}
	}

}
