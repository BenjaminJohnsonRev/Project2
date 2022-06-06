import { NONE_TYPE } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../services/customer.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor() { }
  display!:String;


  ngOnInit(): void {
    this.updateWindow();

  }

  logout(){
    window.open('http://localhost:4200/','_self')?.focus();
  }

  updateWindow(){
    if(CustomerService.getCustomerLoggedIn()){
      this.display="block";
    }
    else{
      this.display="none";
    }
  }
}
