import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Cart } from '../cart';
import { Sandwich } from '../sandwich';
import { SandwichOrderIDObject } from '../sandwichOrderIDObject';
import { Customer } from '../customer';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  // cart!:Cart;
  // sandwich!:SandwichOrerIDObject;
  // // customer!:Customer;

  constructor(private http:HttpClient) { }


  //addCart()-creates an empty cart
  addCart(cart:Cart){
    return this.http.post<Cart>('http://localhost:9002/carts', cart);
  }

  //addSnawichtoCart - adds following sandwiches to existing cart
  addSandwichToCart(soid_object:SandwichOrderIDObject){
    return this.http.put<Cart>('http://localhost:9002/carts/add', soid_object);
  }

  getCart(customer:Customer){
    console.log(customer.customer_id);
    return this.http.get<Cart>('http://localhost:9002/carts/history/customer/'+customer.customer_id);
  }
}
