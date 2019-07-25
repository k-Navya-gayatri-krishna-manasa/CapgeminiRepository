import { Injectable } from '@angular/core';

import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) {

   }
   getAllEmployee(){
     return this.http.get("http://localhost:9902/emplist/getalldata")
   }
   addEmployee(data:any){

     //bcze in spring boot we are using @ModelAttribute to add data usin postman
      let input=new FormData(); 
      input.append("empId",data.id); 
      input.append("empName",data.name);//the names data.id,name,salary are same as addcomponent.html
      input.append("empSalary",data.salary) //the empId,empName,empSalary names should be equal tomnames of DTO layer

    //if we use @RequestBody in spring boot controller that is JSON format
      //let input={"empId":data.id,"empName":data.name,"empSalary":data.salary}

    return this.http.post("http://localhost:9902/emplist/adddata",input);
   }
}
