import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';
import { CategoriesServiceService } from './categories-service.service';
import { FormsModule } from '@angular/forms';
import { CategoryComponent } from './category/category.component';
import { HomeComponent } from './home/home.component';
import { CarouselModule } from 'ngx-owl-carousel-o';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { CartServiceService } from './cart-service.service';
import { ShopingCartComponent } from './shoping-cart/shoping-cart.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CategoryComponent,
    HomeComponent,
    ShopingCartComponent
  ],
  imports: [
    MDBBootstrapModule.forRoot(),
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    CarouselModule
  ],
  providers: [CategoriesServiceService, CartServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
