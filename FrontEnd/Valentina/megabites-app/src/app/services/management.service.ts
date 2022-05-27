import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from '../customer';

@Injectable({
  providedIn: 'root'
})
export class ManagementService {

  constructor(private http:HttpClient) { }

  ban(customer:Customer){
    console.log("ban");
    return this.http.put<any>('http://localhost:9002/customers/banHammer', customer).subscribe(
      (res) => console.log(res),
      (err) => console.log(err));
  }
}
