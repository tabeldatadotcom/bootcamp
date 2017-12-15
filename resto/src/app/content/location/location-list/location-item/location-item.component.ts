import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: '.app-location-item',
  templateUrl: './location-item.component.html',
  styleUrls: ['./location-item.component.css']
})
export class LocationItemComponent implements OnInit {

  @Input('lokasi') lokasi: {
    locationId: string,
    streetAddress: string,
    postalCode: string,
    city: string,
    stateProvince: string,
    country: string
  };

  @Output() rejectData = new EventEmitter<number>();

  @Input('no') nomor: number;

  ngOnInit(): void {

  }

  removeData(nomor: number) {
    this.rejectData.emit(nomor);
  }
}
