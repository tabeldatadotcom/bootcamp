import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';

import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {SuperheroListComponent} from './content/superhero/superhero-list.component';
import {AddSuperheroComponent} from './content/superhero/superhero-add.component';
import {SuperheroItemComponent} from './content/superhero/superhero-item.component';
import {DepartmentListComponent} from './content/department/department-list/department-list.component';
import {DepartmentAddComponent} from './content/department/department-add/department-add.component';
import {DepartmentItemComponent} from './content/department/department-list/department-item/department-item.component';
import {LocationListComponent} from './content/location/location-list/location-list.component';
import {LocationItemComponent} from './content/location/location-list/location-item/location-item.component';
import {LocationAddComponent} from './content/location/location-add/location-add.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SuperheroListComponent,
    AddSuperheroComponent,
    SuperheroItemComponent,
    DepartmentListComponent,
    DepartmentAddComponent,
    DepartmentItemComponent,
    LocationListComponent,
    LocationItemComponent,
    LocationAddComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
