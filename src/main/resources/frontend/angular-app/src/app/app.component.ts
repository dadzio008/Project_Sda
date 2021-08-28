import { OnInit } from '@angular/core';
import { Component } from '@angular/core';
import { Categories } from './categories';
import { CategoriesServiceService } from './categories-service.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{

  categories: Categories[] = [];
  category: Categories;

  constructor(private categoriesService: CategoriesServiceService) {
    this.category = new Categories();
  }

  ngOnInit(){
    this.getAllCategories();
  }

  public getAllCategories(): void{
    this.categoriesService.getAllCategories().subscribe(data => {
      this.categories = data;
    })
  }
  title = 'angular-app';
}
