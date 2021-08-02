package com.colegiohogwarts.app.web.service;

import java.util.ArrayList;

import com.colegiohogwarts.app.web.modelo.Asignatura;

public interface IAsignaturarService {
	
	public ArrayList<Asignatura> getAsiganturas(int idProfesor);	

}
