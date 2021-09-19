import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoryComponent } from './category/category.component';
import { HomeComponent } from './home/home.component';
import { ShopingCartComponent } from './shoping-cart/shoping-cart.component';

const routes: Routes = [
  {
    path: 'category/:id', component: CategoryComponent},
    {path: 'HomePage', component: HomeComponent},
    {path: 'Shoping-Cart', component: ShopingCartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [CategoryComponent, HomeComponent]
