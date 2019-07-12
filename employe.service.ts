import { Injectable } from '@angular/core';
import { IEmployee } from './employe.interface';

@Injectable({
  providedIn: 'root'
})
export class EmployeService {
  employees:IEmployee[]=[

   
      {
       empId:1001,empName:'Rahul',empSal:9000,empDept:'Java'
     },
     {
       empId:1002,empName:'Sachin',empSal:19000,empDept:'OraApps'
     },
     {
       empId:1003,empName:'Vikash',empSal:29000,empDept:'Bi'
     } 
   ];
 
  constructor() { }
  getEmployee():IEmployee[]{
    return this.employees;
  }
  addEmployee(emp){
    this.employees.push(emp);
  }
}
