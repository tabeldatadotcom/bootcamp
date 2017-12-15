import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-location-add',
  templateUrl: './location-add.component.html',
  styleUrls: ['./location-add.component.css']
})
export class LocationAddComponent implements OnInit {

  @Output() sentData = new EventEmitter<{
    locationId: string,
    streetAddress: string,
    postalCode: string,
    city: string,
    stateProvince: string,
    country: string
  }>();

  countries: { countryId: number, countryName: string }[] = [];

  lokasi: {
    locationId: string,
    streetAddress: string,
    postalCode: string,
    city: string,
    stateProvince: string,
    country: string
  } = {
    locationId: null,
    stateProvince: null,
    country: null,
    city: null,
    postalCode: null,
    streetAddress: null
  };

  constructor() {
  }

  ngOnInit() {
    this.countries = [
      {countryId: 32, countryName: 'Jawa'},
      {countryId: 31, countryName: 'Sumatra'},
      {countryId: 30, countryName: 'Medan'},
      {countryId: 33, countryName: 'Maluku'}
    ];
  }

  submitValue() {
    this.sentData.emit(this.lokasi);
    this.lokasi = {
      locationId: null,
      stateProvince: null,
      country: null,
      city: null,
      postalCode: null,
      streetAddress: null
    };

  }
}
