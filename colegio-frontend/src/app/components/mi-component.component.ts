import { Component } from "@angular/core";


@Component({
    selector:"mi-component",
    templateUrl: './miscomponentes/mi-component.component.html',
    styleUrls: ['./miscomponentes/mi-component.component.css'],

})

export class MiComponente{
 
  public titulo: string;
  public comentario: string;
  constructor() {
      this.titulo="";
      this.comentario="";
      console.log("mi componente");
      
  }
}