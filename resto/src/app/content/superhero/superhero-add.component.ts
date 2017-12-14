import { Component, EventEmitter, Output } from '@angular/core';

@Component({
    selector: 'app-add-superhero',
    templateUrl: './superhero-add.component.html'
})
export class AddSuperheroComponent {

    @Output() 
    sentData = new EventEmitter<{name: string, ability: string}>();

    myFavorite: string;
    ability: string;

    showTheValue() {
        this.sentData.emit(
            {name: this.myFavorite, ability: this.ability}
        );
    }

}