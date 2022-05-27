import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Vegetable } from '../vegetable';

@Injectable({
  providedIn: 'root'
})
export class VegetableService {

  constructor(private http:HttpClient) { }

  getAllVegetable(){
    return this.http.get<Vegetable[]>('http://localhost:9002/ingredients/vegetable');
  }
}
