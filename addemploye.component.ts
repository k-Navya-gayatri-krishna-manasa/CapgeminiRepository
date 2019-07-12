import { Component, OnInit } from '@angular/core';
import { IEmployee } from './employe.interface';
import { EmployeService } from './employe.service';
import {Router} from "@angular/router"

@Component({
  selector: 'app-addemploye',
  templateUrl: './addemploye.component.html',
  styleUrls: ['./addemploye.component.css']
})
export class AddemployeComponent implements OnInit {

  employees:IEmployee[];

  constructor(private employeService:EmployeService, private router:Router) { }

  ngOnInit() {
    this.employees=this.employeService.getEmployee();

  }
  onSubmit(form:IEmployee){
    this.employeService.addEmployee(form);
    this.router.navigate(['/list']);//after adding the employee then it will direct add in list and rediredt to employeelist tab
  
  }
}
