import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Sauce } from '../sauce';

@Injectable({
  providedIn: 'root'
})
export class SauceService {

  constructor(private http:HttpClient) { }

  getAllSauce(){
    return this.http.get<Sauce[]>('http://localhost:9002/ingredients/sauce');
  }

}
