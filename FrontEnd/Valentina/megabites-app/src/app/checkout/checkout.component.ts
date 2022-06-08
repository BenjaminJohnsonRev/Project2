import { Component, OnInit } from '@angular/core';
import { ConnectableObservable } from 'rxjs';
import { Cart } from '../cart';
import { CartService } from '../services/cart.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {
  cart!:Cart;

  constructor(private cartService:CartService) { }

  ngOnInit(): void {
    this.cart=CartService.getCart();
    this.cart.submitted=true;
    console.log("Here is the updated sandwich");
    console.log(this.cart);
  }

  submitOrder(){
    this.cartService.updateCart(this.cart).subscribe((cart: Cart) => {
      this.cart = cart;
      console.log(cart);
    })
  }
}
