import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MiComponente } from './components/mi-component.component';
import {BrowserAnimationsModule} from   '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import {MatTabsModule} from '@angular/material/tabs';
import {MatSelectModule} from '@angular/material/select';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import {MatTableModule} from '@angular/material/table';
import {MatButtonToggleModule} from '@angular/material/button-toggle';



@NgModule({
  declarations: [
    AppComponent,
    MiComponente,
  
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatTabsModule,
    MatSelectModule,
    MatCardModule,
    MatInputModule,
    HttpClientModule,
    MatTableModule,
    MatButtonToggleModule,
    FormsModule

  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
