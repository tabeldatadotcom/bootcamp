import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-location-list',
  templateUrl: './location-list.component.html',
  styleUrls: ['./location-list.component.css']
})
export class LocationListComponent implements OnInit {

  kotaBandung: { countryId: number, countryName: string } = {countryId: 32, countryName: 'Kota Bandung'};

  locations: {
    locationId: string,
    streetAddress: string,
    postalCode: string,
    city: string,
    stateProvince: string,
    country: string
  }[] = [];

  constructor() {
  }

  ngOnInit() {

    this.locations = [
      {
        locationId: '1',
        streetAddress: 'Jl. Bukit indah no B8',
        postalCode: '20526',
        city: 'Kab. Bandung',
        stateProvince: 'Jawa Barat',
        country: this.kotaBandung.countryName
      }, {
        locationId: '2',
        streetAddress: 'Jl. Ujung Berung',
        postalCode: '40521',
        city: 'Kota. Bandung',
        stateProvince: 'Jawa Barat',
        country: this.kotaBandung.countryName
      }];

  }

  recipeData(value: {
    locationId: string;
    streetAddress: string;
    postalCode: string;
    city: string;
    stateProvince: string;
    country: string
  }) {
    this.locations.push(value);
  }

  removedData(value: number) {
    this.locations.splice(value, 1);
  }
}
