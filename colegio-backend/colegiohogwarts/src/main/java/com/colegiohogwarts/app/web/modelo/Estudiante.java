package com.colegiohogwarts.app.web.modelo;

public class Estudiante {
	
private int idEstudiante;
private String nombre;


public int getIdEstudiante() {
	return idEstudiante;
}

public void setIdEstudiante(int idEstudiante) {
	this.idEstudiante = idEstudiante;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + idEstudiante;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Estudiante other = (Estudiante) obj;
	if (idEstudiante != other.idEstudiante)
		return false;
	return true;
}


}
