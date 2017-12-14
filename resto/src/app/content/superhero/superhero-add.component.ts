import { Component, EventEmitter, Output } from '@angular/core';

@Component({
    selector: 'app-add-superhero',
    templateUrl: './superhero-add.component.html'
})
export class AddSuperheroComponent {

    @Output() sentData = new EventEmitter<string>();

    myFavorite: string;

    showTheValue() {
        this.sentData.emit(this.myFavorite);
    }

}