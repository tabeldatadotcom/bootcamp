import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { NgForm } from '@angular/forms';

import { DepartmentService } from '../department.service';
import { Department } from '../department.model';


@Component({
  selector: 'app-department-add',
  templateUrl: './department-add.component.html',
  styleUrls: ['./department-add.component.css']
})
export class DepartmentAddComponent implements OnInit {

  @Output() submitDataDepartment = new EventEmitter<Department>();

  department: Department = new Department(null, null, null, null);

  constructor() { }

  ngOnInit() {
  }

  submitData(event: NgForm){
    // this.submitDataDepartment.emit(this.department);
    console.log(event);
  }

}
