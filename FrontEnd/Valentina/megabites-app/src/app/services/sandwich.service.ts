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
  sandwich! : Sandwich;
  constructor(private http:HttpClient) { }
  meat! :Meat;
  bread!:Bread;
  vegetable!:Vegetable;
  seasoning!:Seasoning;
  sauce!:Sauce;
  addSandwich(sandwich:Sandwich){
    // console.log("services");
    // console.log(JSON.stringify(sandwich));
  
   return this.http.post<Sandwich>('http://localhost:9002/sandwiches', sandwich);
  }

  getAllSandWiches(){
    return this.http.get<Sandwich[]>('http://localhost:9002/sandwiches');
  }

  getAllMeat(){

  }

  getAllSauce(){

  }

  getAllSeasoning(){

  }

  getAllVegetable(){

  }
}