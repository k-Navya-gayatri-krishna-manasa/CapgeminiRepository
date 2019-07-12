import { Component, OnInit } from '@angular/core';
import { EmployeService } from './employe.service';
import { IEmployee } from './employe.interface';

@Component({
  selector: 'app-employe',
  templateUrl: './employe.component.html',
  styleUrls: ['./employe.component.css']
})
export class EmployeComponent implements OnInit {
  employees:IEmployee[];
  constructor(private employeService:EmployeService) { }

  ngOnInit() {
    this.employees=this.employeService.getEmployee();
  }
  onDelete(value){
    this.employees.splice(value,1);
  }


}
