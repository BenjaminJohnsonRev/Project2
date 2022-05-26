import { Injectable } from '@angular/core';
import { Meat } from '../meat';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class MeatService {

  constructor(private http:HttpClient) { }

  getAllMeat(){
    return this.http.get<Meat[]>('http://localhost:9002/ingredients/meat');
  }
}