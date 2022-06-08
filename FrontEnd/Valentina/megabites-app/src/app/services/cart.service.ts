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

  static cart= {
    customer_id: 0,
    cost_sum: 0
  }
  // sandwich!:SandwichOrerIDObject;
  // // customer!:Customer;

  constructor(private http:HttpClient) { }

  static getCart(): Cart{
    return this.cart;
  }

  // static setCart(cart:Cart){
  //   this.cart=cart;
  // }

  updateCart(cart:Cart){
    return this.http.put<Cart>('http://localhost:9002/carts', cart);
  }

  //addCart()-creates an empty cart
  addCart(cart:Cart){
    return this.http.post<Cart>('http://localhost:9002/carts', cart);
  }

  //addSnawichtoCart - adds following sandwiches to existing cart
  addSandwichToCart(soid_object:SandwichOrderIDObject){
    return this.http.put<Cart>('http://localhost:9002/carts/add', soid_object);
  }

  getCustomerCart(customer:Customer){
    console.log(customer.customer_id);
    return this.http.get<Cart>('http://localhost:9002/carts/history/customer/'+customer.customer_id);
  }

  getSumCart(cart:Cart){
    return this.http.get<Cart>('http://localhost:9002/carts/cost/'+cart.cart_id);
  }
}
