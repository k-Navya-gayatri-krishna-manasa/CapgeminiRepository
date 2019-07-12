import { Injectable } from '@angular/core';
import { IPro } from './pro-list.interface';
import {HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import{catchError} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class ProListService {
  getProductDetails():Observable<IPro[]>{
    return this.http.get<IPro[]>("assets/products.json").pipe(catchError(this.handleError)); 
  }

  constructor(private http:HttpClient) { }
  handleError(errorResponse:HttpErrorResponse){
    if(errorResponse.error instanceof ErrorEvent){
      console.error("Clent Side Error",errorResponse.error.message);
    }
    else{
      console.error("Serverside Error",errorResponse);
    }
    return throwError("Something went wrong,please try after sometime");
  }
}
