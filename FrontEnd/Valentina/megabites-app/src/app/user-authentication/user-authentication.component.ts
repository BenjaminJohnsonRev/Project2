import { Component, OnInit } from '@angular/core';
import { Customer } from 'src/app/customer';
import { CustomerService } from '../services/customer.service';

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
  display = "grid";

  login(){
    this.display = "none";

  }

  register(){
    this.customerService.register(this.customer).subscribe(
      customer=>console.log(customer)
      )
    this.display = "none";

  }

  onCloseHandled() {
    this.display = "none";
  }
  getCustomer(){
    console.log(this.customer);
  }


}
