import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Component({
    selector: 'app-superhero-list',
    templateUrl: './superhero-list.component.html'
})
export class SuperheroListComponent implements OnInit{
    posts: { userId: number, id: number, title: string, body: string }[] = [];

    constructor(private _http: HttpClient){

    }

    ngOnInit(){
        this._http.get('https://jsonplaceholder.typicode.com/posts').subscribe(
            (data : {userId: number, id: number, title: string, body: string}[]) => {
                this.posts = data;
            }, (error) => {
                console.log(error);
            }
        )
    }

    superheroes: Array<{ nama: string, ability: string }> = [
        { nama: "Superman", ability: "Laser" },
        { nama: "Wonder Women", ability: "Ngaso" },
        { nama: "Iron man", ability: "ngudud" }
    ];


    addAnItem(value: {name: string, ability: string}){
         this.superheroes.push({nama: value.name, ability: value.ability});
    }

    hapusData(value:number){
        this.superheroes.splice(value, 1);
    }

}