import { Component,OnInit } from '@angular/core';
import {ProfesorService} from  './services/profesor.service'
import {Estudiante} from  './models/Estudiante'
import {Profesor} from  './models/Profesor'
import {Asignatura} from  './models/Asignaturas'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit  {
  listProfesores: Profesor[] = [];
  listAsignatura: Asignatura[] = [];
  listaEstudiantes: Estudiante[] = [];
  identificador: number=0;
  asignaturSeleccionada?: number=0;
  asigaturaId: number=0;
  displayedColumns: string[] = ['nombre_asignatura','estudiantes'];
  selectedItem: string = '';

/*INYECCION DE DEPENDENCIAS*/ 
  constructor( public profesorService:ProfesorService){}

  selectChangeHandler (event: any) {
    //update the ui
    this.selectedItem = event.target.value;
    console.log(this.selectedItem);
  }


handleClick(event: Event){  
  
   /*LLAMAR API*/
 this.profesorService.getAsignaturaByProfeId(this.identificador)
 .subscribe(
   asignaturas => {
     this.listAsignatura = asignaturas
   }
 ) 

}

buscarEstudiantes(id: number){  
 
this.profesorService.getEstudantesxAsignaturaId(id)
.subscribe(
  estudiantes => {
    console.log("AsignaturaId: "+ id);
    console.log("Estduiante!!: " + estudiantes[0].nombre)
    this.listaEstudiantes = estudiantes;
  }
)

}

  ngOnInit(){

    this.profesorService.getProfesores()
    .subscribe(
      listaProfesores => {

        this.listProfesores = listaProfesores;

      }
    )

  }
}
