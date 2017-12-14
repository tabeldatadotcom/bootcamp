import {Component} from '@angular/core'

@Component({
    selector: 'app-header',
    template: '<h1>My favorite super hero is {{ myFavorite }}</h1>'
})
export class HeaderComponent{
    myFavorite = 'Tony Stark';
}