import { Component, Input, OnInit } from '@angular/core';
import { LogoutComponent } from '../logout/logout.component';
import { NavigationExtras } from '@angular/router';
import { CustomerService } from '../services/customer.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {



  constructor() { }

  ngOnInit(): void {
    CustomerService.setCustomerLoggedIn(false);
  }

}
