import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {LocationService} from '../location.service';
import {Location} from '../location';

@Component({
  selector: 'app-location-add',
  templateUrl: './location-add.component.html',
  styleUrls: ['./location-add.component.css']
})
export class LocationAddComponent implements OnInit {

  countries: { countryId: number, countryName: string }[] = [];

  lokasi: Location = new Location(
    null,
    null,
    null,
    null,
    null,
    null);

  constructor(private locationService: LocationService) {

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
    this.locationService.addAnItem(this.lokasi);
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
