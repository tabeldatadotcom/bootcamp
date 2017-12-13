import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
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

