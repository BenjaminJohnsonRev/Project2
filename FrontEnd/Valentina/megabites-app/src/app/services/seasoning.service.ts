import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Seasoning } from '../seasoning';

@Injectable({
  providedIn: 'root'
})
export class SeasoningService {

  constructor(private http:HttpClient) { }

  getAllSeasoning(){
    return this.http.get<Seasoning[]>('http://localhost:9002/ingredients/seasoning');
  }
}
