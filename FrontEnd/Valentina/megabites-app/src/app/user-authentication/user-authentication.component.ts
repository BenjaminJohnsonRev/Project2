import { Component, OnInit } from '@angular/core';
import { Customer } from 'src/customer';

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

  constructor() { }


  ngOnInit(): void {
    this.customer={
      username: '',
      password: '',
      first_name: '',
      last_name: '',
      email: ''
    }
  }
  display = "none";

openModal() {
    this.display = "grid";
  }
  onCloseHandled() {
    this.display = "none";
  }
  getCustomer(){
    console.log(this.customer);
  }


}
