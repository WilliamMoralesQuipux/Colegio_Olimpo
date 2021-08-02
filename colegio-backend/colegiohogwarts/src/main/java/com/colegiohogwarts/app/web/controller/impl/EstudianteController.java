package com.colegiohogwarts.app.web.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.colegiohogwarts.app.web.controller.IEstudianteController;
import com.colegiohogwarts.app.web.modelo.Estudiante;
import com.colegiohogwarts.app.web.service.IEstudianteService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("estudiante")
public class EstudianteController implements IEstudianteController {

	@Autowired
	private IEstudianteService estudianteService;
	
	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/estudiantexasignaturas")
	public ResponseEntity<List<Estudiante>> getAsiganturasxprofeId(@RequestParam int asignaturaId) {
		
		List<Estudiante> listaEstudiantes =  estudianteService.getEstudiantexAsignaturaId(asignaturaId);
		return new ResponseEntity<List<Estudiante>>(listaEstudiantes, HttpStatus.OK);
	}

}
