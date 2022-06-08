import { Injectable } from '@angular/core';
import { Customer } from '../customer';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  static customerLoggedIn=false;
  static username='';

  constructor(private http:HttpClient) { }

  login(customer:Customer){
    console.log(customer);
    return this.http.get<Customer>('http://localhost:9002/customers/login/?username='+customer.username+'&password='+customer.password);
  }

  register(customer:Customer){
    console.log(customer);
    return this.http.post<Customer>('http://localhost:9002/customers/register', customer);
  }

  getAllCustomers(){
    return this.http.get<Customer[]>('http://localhost:9002/customers');
  }

  static getCustomerLoggedIn(): boolean{
    return this.customerLoggedIn;
  }

  static setCustomerLoggedIn(newStatus:boolean){
    this.customerLoggedIn=newStatus;
  }

  static getUsername(): string{
    return this.username;
  }

  static setUsername(newUsername:string){
    this.username=newUsername;
  }

}
