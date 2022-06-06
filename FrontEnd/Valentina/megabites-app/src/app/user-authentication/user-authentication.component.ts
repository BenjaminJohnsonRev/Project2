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
  display!:String;

  ngOnInit(): void {
    this.customer={
      username: '',
      password: '',
      first_name: '',
      last_name: '',
      email: ''
    }

    this.updateWindow();
    
  }


  login(){
    this.customerService.login(this.customer).subscribe(
      customer=>{this.customer=customer;
      localStorage.setItem('customerId', String(this.customer.customer_id));
      console.log(customer);
      if(customer==null){
        window.open('http://localhost:4200/','_self')?.focus();
        CustomerService.setCustomerLoggedIn(false);

      }
      else{
        this.display = "none";
        CustomerService.setCustomerLoggedIn(true);
      }
    }
    )
  }

  register(){
    this.customerService.register(this.customer).subscribe(
      customer=>{this.customer=customer;
      console.log(customer);
    this.display = "none";
    CustomerService.setCustomerLoggedIn(true);
      })
  }

  onCloseHandled() {
    this.display = "none";
    window.open('http://localhost:4200/','_self')?.focus();
    CustomerService.setCustomerLoggedIn(false);
  }

  getCustomer(){
    console.log(this.customer);
    return this.customer;
  }

  updateWindow(){
    console.log(CustomerService.getCustomerLoggedIn());
    if(CustomerService.getCustomerLoggedIn()){
      this.display="none";
    }
    else{
      this.display="block";
    }
  }


}
