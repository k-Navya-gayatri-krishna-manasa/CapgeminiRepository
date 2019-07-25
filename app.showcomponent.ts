import {Component, OnInit} from '@angular/core';
import { EmployeeService } from './employee.service';

@Component({
    selector:'show-app',
    templateUrl:'app.show.html'
})
export class ShowComponent implements OnInit{
    constructor(private employeeService:EmployeeService){

    }
    empdata:any[]=[];  //to store all the data in an varaible print the data like interface
    ngOnInit(){
        this.employeeService.getAllEmployee().subscribe((data:any)=>this.empdata=data);
    }
}