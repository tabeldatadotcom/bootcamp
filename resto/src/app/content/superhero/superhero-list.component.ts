import { Component } from "@angular/core";

@Component({
    selector: 'app-superhero-list',
    templateUrl: './superhero-list.html'
})
export class SuperheroListComponent{
    superheroes: Array<{nama: string, ability: string}> = [
        {nama: "Superman", ability: "Laser"},
        {nama: "Wonder Women", ability: "Ngaso"},
        {nama: "Iron man", ability: "ngudud"}
      ];
}