import { Component, OnInit } from '@angular/core';
import { IPro } from './pro-list.interface';
import { ProListService } from './pro-list.service';

@Component({
  selector: 'app-search-list',
  templateUrl: './search-list.component.html',
  styleUrls: ['./search-list.component.css']
})
export class SearchListComponent implements OnInit {
  products:IPro[];
 searchterm:any;
 searchterm1:any;


  constructor(private proListService:ProListService) { }

  ngOnInit() {
    this.proListService.getProductDetails().subscribe((data)=>{this.products=data});
    
  }
  searchitem(){
    this.searchterm1=this.searchterm;
  }

  

}
