import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Categories } from './categories';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Products } from './products';

@Injectable({
  providedIn: 'root'
})
export class CartServiceService{

    private cartUrl: string;

    constructor(private http: HttpClient) {
        this.cartUrl = 'http://localhost:8080/HomePage/cart';
       }
       public addToCart(id: number, product: Products): Observable<any>{
          return this.http.put(`${this.cartUrl}/${id}`, product);
       }
}