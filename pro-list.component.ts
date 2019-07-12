import { Component, OnInit } from '@angular/core';
import { IPro } from './pro-list.interface';
import { ProListService } from './pro-list.service';



@Component({
  selector: 'app-pro-list',
  templateUrl: './pro-list.component.html',
  styleUrls: ['./pro-list.component.css']
})
export class ProListComponent implements OnInit {
  products:IPro[];
  constructor(private proListService:ProListService) { }

  ngOnInit() {
    this.proListService.getProductDetails().subscribe((data)=>{this.products=data});
  }
  onDelete(value){
    this.products.splice(value,1);
  }
}
