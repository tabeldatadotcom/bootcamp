import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Department } from './department.model';

@Injectable()
export class DepartmentService {

  private baseUrl: string = "http://localhost:8080/departments";

  constructor(private _http: HttpClient) {
  }

  getData() {
    return this._http.get(this.baseUrl + '/list');
  }

  addNewData(department: Department){
    return this._http.post(this.baseUrl+ '/simpan', department);
  }

}
