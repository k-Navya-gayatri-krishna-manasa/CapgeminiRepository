import { Pipe, PipeTransform } from '@angular/core';
import { IPro } from './pro-list.interface';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(product:IPro[], searchterm:any) {
    if(!product || !searchterm){
      return product;

    }
    return product.filter(p=>p.ProductName.toLowerCase().startsWith(searchterm.toLowerCase())||p.ProductId==searchterm||p.ProductCategory.toLowerCase().startsWith(searchterm.toLowerCase()))
  }

}
