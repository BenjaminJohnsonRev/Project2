import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from '../customer';
import { Manager } from '../manager';
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

  login(manager:Manager){
    console.log(manager);
    return this.http.get<Manager>('http://localhost:9002/managers/login/?username='+manager.username+'&password='+manager.password);
  }
}
