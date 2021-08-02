package com.colegiohogwarts.app.web.controller.impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.colegiohogwarts.app.web.controller.IProfesorController;
import com.colegiohogwarts.app.web.modelo.Profesor;
import com.colegiohogwarts.app.web.service.IProfesorService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("profesor")
public class ProfesorController implements IProfesorController {

	@Autowired
	private IProfesorService profesorService;

	@RequestMapping(method = RequestMethod.GET, value = "/listaprofesores")
	public ResponseEntity<ArrayList<Profesor>> getListaProfesores() {

		ArrayList<Profesor> profesores = profesorService.getListaProfesores();
		return new ResponseEntity<ArrayList<Profesor>>(profesores, HttpStatus.OK);

	}

}
