import { Injectable } from '@angular/core';
import { Sandwich } from '../sandwich';
import { HttpClient } from '@angular/common/http';
import { Bread } from '../bread';
import { Vegetable } from '../vegetable';
import { Meat } from '../meat';
import { Seasoning } from '../seasoning';
import { Sauce } from '../sauce';

@Injectable({
  providedIn: 'root'
})
export class SandwichService {

  constructor(private http:HttpClient) { }

  addSandwich(){
   // console.log("Service");
    console.log("Sandwich services here!");
   //add your link from postman "http://localhost:9001/endpoint"
   //return this.http.post<Sandwich>('http://localhost:9002/sandwiches', sandwich);
  }

  sandwich!: Sandwich;

  // buildSandwich(bread : Bread, meat: Meat, vegetable: Vegetable, seasoning : Seasoning, sauce : Sauce){
    
  //   sandwich.bread = bread;
  //   this.meat = meat;
  //   this.vegetable = vegetable;
  //   this.seasoning = seasoning;
  //   this.sauce = sauce;


  // }
  


  getAllMeat(){

  }

  getAllSauce(){

  }

  getAllSeasoning(){

  }

  getAllVegetable(){

  }
}