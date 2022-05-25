import { Injectable } from '@angular/core';
import { Customer } from '../customer';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }

  login(customer:Customer){

  }

  register(customer:Customer){
    console.log(customer);
    return this.http.post<Customer>('http://localhost:9002/customers/add',customer);
  }
}
