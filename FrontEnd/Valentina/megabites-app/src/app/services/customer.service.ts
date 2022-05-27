import { Injectable } from '@angular/core';
import { Customer } from '../customer';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }

  login(customer:Customer){
    console.log(customer);
    console.log(customer.username);
    return this.http.get<Customer>('http://localhost:9002/customers/login/?username='+customer.username+'&password='+customer.password);
  }

  register(customer:Customer){
    console.log(customer);
    return this.http.post<Customer>('http://localhost:9002/customers/register', customer).subscribe(
      (res) => console.log(res),
      (err) => console.log(err));
  }

  ban(id: number){
    console.log("ban id: " + id);
    return this.http.put<any>('http://localhost:9002/customers/banHammer/' + id, "").subscribe(
      (res) => console.log(res),
      (err) => console.log(err));
  }
}
