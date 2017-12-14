import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {

  showTheValue() {
    // this.superheroes.push({nama: this.myFavorite, ability: null});
    // console.log(this.myFavorite);
  }

  showMeTheValue(value: number) {
    // this.superheroes.splice(value, 1);
  }
  
  myFavorite = 'Iron Man';
  
  onChangeText(value) {
    console.log(value);
  }

}

