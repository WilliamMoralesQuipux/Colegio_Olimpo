package com.colegiohogwarts.app.web.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import com.colegiohogwarts.app.web.modelo.Estudiante;

public interface IEstudianteController {
	
	public ResponseEntity<List<Estudiante>> getAsiganturasxprofeId(@RequestParam int asignaturaId);
}
