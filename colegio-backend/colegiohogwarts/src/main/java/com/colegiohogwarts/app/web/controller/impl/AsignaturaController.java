package com.colegiohogwarts.app.web.controller.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.colegiohogwarts.app.web.controller.IAsignaturaController;
import com.colegiohogwarts.app.web.modelo.Asignatura;
import com.colegiohogwarts.app.web.service.IAsignaturarService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("asignatura")
public class AsignaturaController implements IAsignaturaController {

	@Autowired
	private IAsignaturarService asignaturarService;
	
	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/asignaturaxprofesorid")
	public ResponseEntity<ArrayList<Asignatura>> getAsiganturasxprofeId(@RequestParam int idProfesor) {

		ArrayList<Asignatura> outDto =  asignaturarService.getAsiganturas(idProfesor);

		return new ResponseEntity<ArrayList<Asignatura>>(outDto, HttpStatus.OK);
	}
	
	

}
