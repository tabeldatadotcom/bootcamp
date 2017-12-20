import { Component, OnInit } from '@angular/core';
import { DepartmentService } from '../department.service';
import { Department } from '../department.model';

@Component({
  selector: 'app-department-add',
  templateUrl: './department-add.component.html',
  styleUrls: ['./department-add.component.css']
})
export class DepartmentAddComponent implements OnInit {

  department: Department = new Department(null, null, null, null);

  constructor(private _depService: DepartmentService) { }

  ngOnInit() {
  }

  submitData(event: any){
    this._depService.addNewData(this.department).subscribe(
      data => {
        console.log(data)
        this.department = new Department(null, null, null, null);
      }, 
      error => console.log(error)
    );
  }

}
