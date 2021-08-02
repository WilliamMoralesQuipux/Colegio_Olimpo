package com.colegiohogwarts.app.web.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.colegiohogwarts.app.web.dao.IEstudianteDao;
import com.colegiohogwarts.app.web.modelo.Estudiante;

@Repository
public class EstudianteDao implements IEstudianteDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	@SuppressWarnings("rawtypes")
	public List<Estudiante> getEstudiantexAsignaturaId(int idAsignatura) {
		try {

			String sql = "SELECT  ESTUDIANTE.idestudiante , ESTUDIANTE.nombre FROM CURSOXASIGNATURA "
					+ "INNER JOIN CURSOS  ON CURSOS.IDCURSO  = CURSOXASIGNATURA.IDCURSO "
					+ "INNER JOIN ESTUDIANTE  ON  ESTUDIANTE.IDCURSO =  CURSOS.IDCURSO "
					+ "WHERE  CURSOXASIGNATURA.IDASIGNATURA  = " + idAsignatura;

			List<Estudiante> listaEstudiantes = new ArrayList<>();

			List<Map<String, Object>> filas = template.queryForList(sql);

			for (Map fila : filas) {
				Estudiante estudiante = new Estudiante();
				estudiante.setIdEstudiante(((int) fila.get("idestudiante")));
				estudiante.setNombre((String) fila.get("nombre"));
				listaEstudiantes.add(estudiante);
			}

			return listaEstudiantes;

		} catch (Exception e) {
			return null;
		}

	}

}
