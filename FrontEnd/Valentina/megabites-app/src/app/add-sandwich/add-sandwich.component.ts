import { Component, OnInit, ViewChild } from '@angular/core';
import { UserAuthenticationComponent } from '../user-authentication/user-authentication.component';
import { Sandwich } from '../sandwich';
import { SandwichService } from '../services/sandwich.service';
import { Meat } from '../meat';
import { Bread } from '../bread';
import { Sauce } from '../sauce';
import { Vegetable } from '../vegetable';
import { Seasoning } from '../seasoning';
import { BreadService } from '../services/bread.service';
import { MeatService } from '../services/meat.service';
import { VegetableService } from '../services/vegetable.service';
import { SeasoningService } from '../services/seasoning.service';
import { SauceService } from '../services/sauce.service';
import { FormBuilder } from '@angular/forms';
import { CartService } from '../services/cart.service';
import { Customer } from '../customer';
import { Cart } from '../cart';
import { CustomerService } from '../services/customer.service';

@Component({
  selector: 'app-add-sandwich',
  templateUrl: './add-sandwich.component.html',
  styleUrls: ['./add-sandwich.component.css']
})
export class AddSandwichComponent implements OnInit {

  @ViewChild(UserAuthenticationComponent)
  private customerComponent!: UserAuthenticationComponent;
  
  breads!: Bread[];
  meats!: Meat[];
  vegetables!: Vegetable[];
  seasonings!: Seasoning[];
  sauces!: Sauce[];
  customer!:Customer;
  child_customer!:Customer;
  cart!:Cart;

  

  constructor(private sandwichService:SandwichService,
     private breadService:BreadService,
     private meatService:MeatService,
     private vegetableService:VegetableService,
     private seasoningService:SeasoningService,
     private sauceService:SauceService,
     private cartService:CartService
    //  
    ) { }

  ngOnInit(): void {
    this.sandwich = {
        bread: {
            id: 0,
            name: '',
            price: 0.0
        },
        meat: {
            id: 0,
            name: '',
            price: 0.0
        },
        vegetable: {
            id: 0,
            name: '',
            price: 0.0
        },
        sauce: {
            id: 0,
            name: '',
            price: 0.0
        },
        seasoning: {
            id: 0,
            name: '',
            price: 0.0
        }
        
    }
    this.getAllBread();
    this.getAllMeat();
    this.getAllSauce();
    this.getAllVegetable();
    this.getAllSeasoning();
    
  }

  // onLogin(customer:Customer){
  //   this.customer=customer;
  // }
  getCustomer(){
    this.child_customer=this.customerComponent.getCustomer();
    // return this.customer;
    console.log("here is the new customer")
    console.log(this.customer);
  }

  getAllBread(){
    this.breadService.getAllBread().subscribe((breads:Bread[])=>{
      this.breads = breads;
      console.log(breads);
    })
  }

  getAllMeat(){
    this.meatService.getAllMeat().subscribe((meats:Meat[])=>{
      this.meats = meats;
      console.log(meats);
    })
  }

  getAllVegetable(){
    this.vegetableService.getAllVegetable().subscribe((vegetables:Vegetable[])=>{
      this.vegetables = vegetables;
      console.log(vegetables);
    })
  }
  getAllSeasoning(){
    this.seasoningService.getAllSeasoning().subscribe((seasonings:Seasoning[])=>{
      this.seasonings = seasonings;
      console.log(seasonings);
    })
  }
  getAllSauce(){
    this.sauceService.getAllSauce().subscribe((sauces:Sauce[])=>{
      this.sauces = sauces;
      console.log(sauces);
    })
  }
    
  sandwich!: Sandwich;
  meat! :Meat;
  bread!:Bread;
  vegetable!:Vegetable;
  seasoning!:Seasoning;
  sauce!:Sauce;

  
  addSandwich() {
    this.getCustomer();

    console.log("this.sandwich");
    console.log(this.meat);
    this.sandwich.bread = this.bread;
    this.sandwich.meat = this.meat;
    this.sandwich.vegetable =  this.vegetable;
    this.sandwich.sauce = this.sauce;
    this.sandwich.seasoning = this.seasoning;
    this.sandwichService.addSandwich(this.sandwich);


    console.log(this.child_customer);
    this.cartService.getCart(this.child_customer).subscribe(
      cart=>{this.cart = cart;
      console.log(cart);
    });
    
    if(this.cart==null){
      console.log("This user has no carts");
    }
    else{
      console.log("This user has at least one cart");
    }

    // this.sandwichService.addSandwichToCart(this.sandwich);
  }
}

