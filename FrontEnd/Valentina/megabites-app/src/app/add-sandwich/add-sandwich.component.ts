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
import { SandwichOrderIDObject } from '../sandwichOrderIDObject';

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

  customer!: Customer;
  cart!: Cart;
  soid_object!: SandwichOrderIDObject;
  sandwich!: Sandwich;
  meat!: Meat;
  bread!: Bread;
  vegetable!: Vegetable;
  seasoning!: Seasoning;
  sauce!: Sauce;
  empty_sandwich!: Sandwich;
  quantity!:Number;
  numbers!:Number[];



  constructor(private sandwichService: SandwichService,
    private breadService: BreadService,
    private meatService: MeatService,
    private vegetableService: VegetableService,
    private seasoningService: SeasoningService,
    private sauceService: SauceService,
    private cartService: CartService
    //
  ) { }

  ngOnInit(): void {
  
    this.empty_sandwich = {
      sandwich_id: 0,
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

    this.cart = {
      customer_id: 0,
      employee_id: 0,
      cost_sum: 0
    }

    this.soid_object = {
      order_id: 0,
      sandwich_id: 0
    }

    this.getAllBread();
    this.getAllMeat();
    this.getAllSauce();
    this.getAllVegetable();
    this.getAllSeasoning();
    this.numbers=Array.from(Array(10),(x,i)=>i).map(i=>i+1);
  }


  getCustomer() {
    this.customer = this.customerComponent.customer;
    console.log("here is the new customer")
    console.log(this.customer);
  }

  getAllBread() {
    this.breadService.getAllBread().subscribe((breads: Bread[]) => {
      this.breads = breads;
      console.log(breads);
    })
  }

  getAllMeat() {
    this.meatService.getAllMeat().subscribe((meats: Meat[]) => {
      this.meats = meats;
      console.log(meats);
    })
  }

  getAllVegetable() {
    this.vegetableService.getAllVegetable().subscribe((vegetables: Vegetable[]) => {
      this.vegetables = vegetables;
      console.log(vegetables);
    })
  }
  getAllSeasoning() {
    this.seasoningService.getAllSeasoning().subscribe((seasonings: Seasoning[]) => {
      this.seasonings = seasonings;
      console.log(seasonings);
    })
  }
  getAllSauce() {
    this.sauceService.getAllSauce().subscribe((sauces: Sauce[]) => {
      this.sauces = sauces;
      console.log(sauces);
    })
  }




  addSandwich() {
    this.getCustomer();

    this.cart.customer_id = this.customer.customer_id;

    this.sandwich = {
      bread: this.bread,
      meat: this.meat,
      vegetable: this.vegetable,
      sauce: this.sauce,
      seasoning: this.seasoning
    };

    this.cartService.addCart(this.cart).subscribe(
      cart => {
        this.cart = cart;
        console.log(cart);


        for(let i=0;i<this.quantity;i++){

        this.sandwichService.addSandwich(this.sandwich).subscribe(
          sandwich => {
            this.sandwich = sandwich;
            console.log(sandwich);

            if (this.cart == null) {
              console.log("This user has no carts");
            }
            else {
              console.log("This user has at least one cart");
            }

            this.soid_object.order_id = this.cart.cart_id;
            this.soid_object.sandwich_id = this.sandwich.sandwich_id;

            console.log(this.soid_object.order_id);
            console.log(this.soid_object.sandwich_id);

            this.cartService.addSandwichToCart(this.soid_object).subscribe(
              cart => {
                this.cart = cart;
                console.log(cart);

                this.cartService.getSumCart(this.cart).subscribe(
                  cart => {
                    this.cart = cart;
                    console.log(cart);
                  });
              });

          });
        }
      });
  }
}

