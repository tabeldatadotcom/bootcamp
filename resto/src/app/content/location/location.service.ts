import {Injectable, OnInit} from '@angular/core';

export class LocationService implements OnInit {

  private kotaBandung: {
    countryId: number,
    countryName: string
  } = {countryId: 32, countryName: 'Kota Bandung'};

  private _locations: {
    locationId: string,
    streetAddress: string,
    postalCode: string,
    city: string,
    stateProvince: string,
    country: string
  }[] = [];

  get locations() {
    return this._locations;
  }

  constructor() {
    this._locations = [
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

  addAnItem(location: {
    locationId: string,
    streetAddress: string,
    postalCode: string,
    city: string,
    stateProvince: string,
    country: string
  }) {
    this._locations.push(location);
  }

  removeAnItem(value: number) {
    this._locations.splice(value, 1);
  }

  ngOnInit() {

  }

}
