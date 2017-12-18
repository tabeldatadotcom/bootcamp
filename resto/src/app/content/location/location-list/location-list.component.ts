import {Component, OnInit} from '@angular/core';
import {LocationService} from '../location.service';

@Component({
  selector: 'app-location-list',
  templateUrl: './location-list.component.html',
  styleUrls: ['./location-list.component.css']
})
export class LocationListComponent implements OnInit {

  constructor(private locationService: LocationService){

  }

  locations: {locationId: string,
    streetAddress: string,
    postalCode: string,
    city: string,
    stateProvince: string,
    country: string}[] = [];

  ngOnInit() {
    this.locations = this.locationService.locations;
  }

  removedData(value: number) {
    this.locationService.removeAnItem(value);
  }
}
