import { Injectable } from '@angular/core';
import { Bread } from '../bread';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class BreadService {

  constructor(private http:HttpClient) { }

  getAllBread(){
    return this.http.get<Bread[]>('http://localhost:9002/ingredients/bread');
  }
}
