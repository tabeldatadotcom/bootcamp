import { Component, OnInit, OnDestroy } from '@angular/core';
import { Department } from '../department.model';
import { DepartmentService } from '../department.service';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent implements OnInit, OnDestroy {

  datas: Department[] = [];

  constructor(private _depService: DepartmentService) { }

  ngOnDestroy(){

  }

  ngOnInit() {
    this.loadData();
  }

  loadData(){
    this._depService.getData().subscribe((resp:Department[]) => {
      this.datas = resp;
    });
  }

  newDataDepartment(department: Department){
    this._depService.addNewData(department).subscribe(
      data => {
        console.log(data);
      }, 
      error => console.log(error)
    );
    this.loadData();
  }

}
