import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {

  showTheValue() {
    this.superheroes.push({nama: this.myFavorite, ability: null});
    // console.log(this.myFavorite);
  }

  showMeTheValue(value: number) {
    this.superheroes.splice(value, 1);
  }
  
  myFavorite = 'Iron Man';
  superheroes: Array<{nama: string, ability: string}> = [
    {nama: "Superman", ability: "Laser"},
    {nama: "Wonder Women", ability: "Ngaso"},
    {nama: "Iron man", ability: "ngudud"}
  ];

  onChangeText(value) {
    console.log(value);
  }

}

