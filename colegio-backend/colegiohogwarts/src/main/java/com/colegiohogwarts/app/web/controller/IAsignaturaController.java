package com.colegiohogwarts.app.web.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import com.colegiohogwarts.app.web.modelo.Asignatura;

public interface IAsignaturaController {
	
	public ResponseEntity<ArrayList<Asignatura>> getAsiganturasxprofeId(@RequestParam int idProfesor);

}
