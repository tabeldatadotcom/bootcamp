import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';

import {AppComponent} from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SuperheroListComponent } from './content/superhero/superhero-list.component';
import { AddSuperheroComponent } from './content/superhero/superhero-add.component';
import { SuperheroItemComponent } from './content/superhero/superhero-item.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SuperheroListComponent,
    AddSuperheroComponent,
    SuperheroItemComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
