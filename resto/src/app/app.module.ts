import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

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
import {LocationEditComponent} from './content/location/location-edit/location-edit.component';
import {LocationService} from './content/location/location.service';

const routerLink: Routes = [
  {path: 'heroes', component: SuperheroListComponent},
  {
    path: 'locations', component: LocationListComponent, children: [
      {path: 'add', component: LocationAddComponent},
      {path: 'edit', component: LocationEditComponent},
    ]
  },
  {path: 'departments', component: DepartmentListComponent}
];

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
    LocationAddComponent,
    LocationEditComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routerLink),
    HttpClientModule
  ],
  providers: [LocationService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
