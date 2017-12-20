import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable()
export class DepartmentService {

  baseUrl: string = 'http://localhost:8080/departments';

  constructor(private _http: HttpClient) {
  }

  getData() {
    return this._http.get(this.baseUrl + '/list');
  }

}
