import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DeliveryOrPickupService {
  static deliveryLoggedIn=false;
  static pickupLoggedIn=false;
  constructor(private http:HttpClient) {
   }

   static getDeliveryLoggedIn(): boolean{
    return this.deliveryLoggedIn;
  }

  static setDeliveryLoggedIn(newStatus:boolean){
    this.deliveryLoggedIn=newStatus;
  }

  static getPickupLoggedIn(): boolean{
    return this.pickupLoggedIn;
  }

  static setPickupLoggedIn(newStatus:boolean){
    this.pickupLoggedIn=newStatus;
  }
}


