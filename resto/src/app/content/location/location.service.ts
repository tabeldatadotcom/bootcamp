import {Location} from './location';

export class LocationService {

  private kotaBandung: {
    countryId: number,
    countryName: string
  } = {countryId: 32, countryName: 'Kota Bandung'};

  private _locations: Location[] = [];

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

  addAnItem(location: Location) {
    this._locations.push(location);
  }

  removeAnItem(value: number) {
    this._locations.splice(value, 1);
  }

}
