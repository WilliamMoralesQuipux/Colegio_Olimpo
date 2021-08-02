package com.colegiohogwarts.app.web.dao;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestParam;

import com.colegiohogwarts.app.web.modelo.Asignatura;

public interface IAsignaturaDao {
	
	public ArrayList<Asignatura> getAsiganturas(@RequestParam int idProfesor);

}
