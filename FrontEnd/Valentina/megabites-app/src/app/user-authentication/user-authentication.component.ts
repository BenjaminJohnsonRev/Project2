import { Component, OnInit, Output } from '@angular/core';
import { Customer } from 'src/app/customer';
import { LogoutComponent } from '../logout/logout.component';
import { CustomerService } from '../services/customer.service';
import {  EventEmitter} from '@angular/core';


@Component({
  selector: 'app-user-authentication',
  templateUrl: './user-authentication.component.html',
  styles:[
    '.modal{background: rgba(0,0,0, .5)};'
  ],
  styleUrls: ['./user-authentication.component.css']
})
export class UserAuthenticationComponent implements OnInit {
  customer!: Customer;

  constructor(private customerService:CustomerService) { }


  ngOnInit(): void {
    this.customer={
      username: '',
      password: '',
      first_name: '',
      last_name: '',
      email: ''
    }
  }
  display = "block";

  login(){
    this.customerService.login(this.customer).subscribe(
      customer=>{this.customer=customer;
      console.log(customer);
      if(customer==null){
        window.open('http://localhost:4200/','_self')?.focus();
      }
      else{
        this.display = "none";
      }
    }
    )

    

  }

  register(){
    this.customerService.register(this.customer).subscribe(
      customer=>{this.customer=customer;
      console.log(customer);
    this.display = "none";
      })
  }

  onCloseHandled() {
    this.display = "none";
    window.open('http://localhost:4200/','_self')?.focus();
  }

  getCustomer(){
    console.log(this.customer);
    return this.customer;
  }


}
