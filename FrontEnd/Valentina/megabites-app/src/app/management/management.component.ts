import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../services/customer.service';
import { ManagementService } from '../services/management.service';

@Component({
  selector: 'app-management',
  templateUrl: './management.component.html',
  styleUrls: ['./management.component.css']
})
export class ManagementComponent implements OnInit {

  constructor(private managementService:ManagementService, 
    private customerService:CustomerService ) { }


  customers!: Customer[];
  id?: number;
  ngOnInit(): void {
    
    this.getAllCustomers();
  }

  getAllCustomers(){
    this.customerService.getAllCustomers().subscribe((customers:Customer[])=>{
      this.customers = customers;
      console.log(customers);
    })
  }

  customer!:Customer;
  ban(){
    console.log(this.customer)
    this.managementService.ban(this.customer);
  }
}
