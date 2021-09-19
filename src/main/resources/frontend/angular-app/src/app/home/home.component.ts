import { registerLocaleData } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { CartServiceService } from '../cart-service.service';
import { Categories } from '../categories';
import { CategoriesServiceService } from '../categories-service.service';
import { Products } from '../products';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  
  customOptions: OwlOptions = {
    loop: true,
    mouseDrag: false,
    touchDrag: false,
    pullDrag: false,
    dots: false,
    navSpeed: 700,
    navText: ['', ''],
    responsive: {
      0: {
        items: 1
      },
      400: {
        items: 2
      },
      740: {
        items: 3
      },
      940: {
        items: 4
      }
    },
    nav: true
  }

  categories: Categories[] = [];
  category: Categories;
  products: Products[] = [];
  product: Products;


  constructor(private categoriesService: CategoriesServiceService, private  cartService: CartServiceService) {
    this.category = new Categories();
    this.product = new Products();
  }
  

  ngOnInit(){
    this.getAllCategories();
    // set-bg;
  }

  public getAllCategories(): void{
    this.categoriesService.getAllCategories().subscribe(data => {
      this.categories = data;
    })
  }
  public addToCart(id: number){
    this.cartService.addToCart(id, this.product).subscribe( data =>{
      this.product=data;
    })

  }
}
