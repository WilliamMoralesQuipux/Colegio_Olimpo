import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Estudiante } from '../models/Estudiante';
import { Asignatura } from '../models/Asignaturas';


@Injectable({
    providedIn: 'root'
  })

  export class ProfesorService {

    constructor(private http: HttpClient) { }
  
    getProfesores(){
      return this.http.get<Estudiante[]>('http://localhost:8080/profesor/listaprofesores');
    }

    getAsignaturaByProfeId(id:number){
      return this.http.get<Asignatura[]>('http://localhost:8080/asignatura/asignaturaxprofesorid?idProfesor='+id);
    }

    getEstudantesxAsignaturaId(id:number){
      return this.http.get<Estudiante[]>('http://localhost:8080/estudiante/estudiantexasignaturas?asignaturaId='+id);
    }
  
  }

