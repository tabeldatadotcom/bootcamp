import {Component, OnInit} from '@angular/core';
import {LocationService} from '../location.service';
import {Location} from '../location';

@Component({
  selector: 'app-location-list',
  templateUrl: './location-list.component.html',
  styleUrls: ['./location-list.component.css']
})
export class LocationListComponent implements OnInit {

  constructor(private locationService: LocationService){

  }

  locations: Location[] = [];

  ngOnInit() {
    this.locations = this.locationService.locations;
  }

  removedData(value: number) {
    this.locationService.removeAnItem(value);
  }
}
