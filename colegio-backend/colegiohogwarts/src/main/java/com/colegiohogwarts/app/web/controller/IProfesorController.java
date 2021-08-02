package com.colegiohogwarts.app.web.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;

import com.colegiohogwarts.app.web.modelo.Profesor;

public interface IProfesorController {
	
	public ResponseEntity<ArrayList<Profesor>> getListaProfesores();

}
