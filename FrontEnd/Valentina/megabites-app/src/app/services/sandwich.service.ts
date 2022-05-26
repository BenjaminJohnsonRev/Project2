import { Injectable } from '@angular/core';
import { Sandwich } from '../sandwich';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SandwichService {

  constructor(private http:HttpClient) { }

  addSandwich(sandwich:Sandwich){
   // console.log("Service");
    console.log(sandwich);
   //add your link from postman "http://localhost:9001/endpoint"
   //return this.http.post<Sandwich>('http://localhost:9002/sandwiches', sandwich);
  }
}