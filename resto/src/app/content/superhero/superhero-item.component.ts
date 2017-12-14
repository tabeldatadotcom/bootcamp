import {Component, Input, Output, EventEmitter} from '@angular/core';

@Component({
    selector: '.app-superhero-item',
    template: `
            <td>{{ nomor + 1}}</td>
            <td>{{ pahlawan.nama }}</td>
            <td>{{ pahlawan.ability }}</td>
            <td>
                <a (click)="removed(nomor)">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
    `
})
export class SuperheroItemComponent{

    @Output() 
    onRemove = new EventEmitter<number>();

    @Input() 
    nomor: number;

    @Input() 
    pahlawan: {nama: string, ability: string};

    removed(value: number) {
        this.onRemove.emit(value);
        // this.superheroes.splice(value, 1);
    }

}