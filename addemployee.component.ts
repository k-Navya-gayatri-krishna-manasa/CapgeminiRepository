import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-addemployee',
  templateUrl: './addemployee.component.html',
  styleUrls: ['./addemployee.component.css']
})
export class AddemployeeComponent implements OnInit {
  /* eid:number;
  ename:String;
  esalary:number; */
  model:any={};  //model is the obj that accepts the data of employee id,name,salary

  addEmployee():any{
    console.log(this.model);
    this.employeeService.addEmployee(this.model).subscribe();
  }
  constructor(private employeeService:EmployeeService) { }

  ngOnInit() {
  }

}
