import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>My favorite super hero is {{ myFavorite }}</h1>
    <br/>
    Daftar super hero:
    <!-- ini komentar -->
    <ul>
      <li *ngFor="let hero of superheroes; let i = index">
        <button (click)="showMeTheValue(i)">
          {{ hero }}
        </button>
      </li>
    </ul>
    <label for="namaSuperhero">Nama Super Hero</label>
    <input id="namaSuperhero" type="text" 
      name="myfavorite" [(ngModel)]="myFavorite"/>
    <br/>
    <button (click)="showTheValue()">Tambah</button><br/>
  `
})
export class AppComponent {

  showTheValue() {
    this.superheroes.push(this.myFavorite);
    // console.log(this.myFavorite);
  }

  showMeTheValue(value: number) {
    this.superheroes.splice(value, 1);
  }
  
  myFavorite = 'Iron Man';
  superheroes: Array<string> = [
    'Superman',
    'Batman',
    'Wonder Women',
    'Iron Man'
  ];

  onChangeText(value) {
    console.log(value);
  }

}

