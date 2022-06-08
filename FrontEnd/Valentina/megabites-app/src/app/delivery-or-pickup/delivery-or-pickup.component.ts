import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { Delivery } from '../delivery';
import { Pickup } from '../pickup';
import { CustomerService } from '../services/customer.service';
import { DeliveryOrPickupService } from '../services/delivery-or-pickup.service';

@Component({
  selector: 'app-delivery-or-pickup',
  templateUrl: './delivery-or-pickup.component.html',
  styles:[
    '.modal{background: rgba(0,0,0, .5)};'
  ],
  styleUrls: ['./delivery-or-pickup.component.css']
})
export class DeliveryOrPickupComponent implements OnInit {

  customer!: Customer;
  delivery!: Delivery;
  pickup!: Pickup;
  pickupOrDelivery!: String;

  constructor(private customerService:CustomerService, private deliveryOrPickupService:DeliveryOrPickupService) { }
  display!:String;

  ngOnInit(): void {
    this.delivery={
      status: false,
      address: ''
    }

    this.pickup={
      status: false,
      address: ''
    }


    this.updateWindow();
    
  }


  forDelivery(){
    // this.deliveryOrPickupService.login(this.delivery).subscribe(
    //   delivery=>{this.delivery=delivery;
      // this.delivery = delivery;
      if(this.pickupOrDelivery === ("delivery")){
        localStorage.setItem('deliveryAddress', String(this.delivery.address));
        console.log(this.delivery.address);
        if(this.delivery==null){
        window.open('http://localhost:4200/','_self')?.focus();
        DeliveryOrPickupService.setDeliveryLoggedIn(false);
        }
        else{
          this.display = "none";
          DeliveryOrPickupService.setDeliveryLoggedIn(true);
        }

      } else if(this.pickupOrDelivery === "pickup"){ 
        localStorage.setItem('pickupAddress', String(this.pickup.address));
        console.log(this.pickup.address);
        if(this.pickup==null){
          window.open('http://localhost:4200/','_self')?.focus();
          DeliveryOrPickupService.setPickupLoggedIn(false);

        }
        else{
          this.display = "none";
          DeliveryOrPickupService.setPickupLoggedIn(true);
        }
      
      }
      
    }
  

  // forPickup(){
  //   // this.deliveryOrPickupService.login(this.pickup).subscribe(
  //   //   pickup=>{this.pickup=pickup;
  //     localStorage.setItem('pickupAddress', String(this.pickup.address));
  //     console.log(this.pickup.address);
  //     if(this.pickup==null){
  //       window.open('http://localhost:4200/','_self')?.focus();
  //       DeliveryOrPickupService.setPickupLoggedIn(false);

  //     }
  //     else{
  //       this.display = "none";
  //       DeliveryOrPickupService.setPickupLoggedIn(true);
  //     }
  //   }

  onCloseHandled() {
    this.display = "none";
    window.open('http://localhost:4200/','_self')?.focus();
    CustomerService.setCustomerLoggedIn(false);
  }

  getCustomer(){
    console.log(this.customer);
    return this.customer;
  }

  updateWindow(){
    console.log(CustomerService.getCustomerLoggedIn());
    if(CustomerService.getCustomerLoggedIn()){
      this.display="none";
    }
    else{
      this.display="block";
    }
  }
}