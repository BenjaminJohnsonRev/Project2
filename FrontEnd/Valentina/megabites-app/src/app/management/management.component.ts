
import { Component, OnInit } from '@angular/core';
import { waitForAsync } from '@angular/core/testing';
import { Complaints } from '../complaints';
import { Customer } from '../customer';
import { ComplaintsService } from '../services/complaints.service';
import { CustomerService } from '../services/customer.service';
import { ManagementService } from '../services/management.service';

@Component({
  selector: 'app-management',
  templateUrl: './management.component.html',
  styleUrls: ['./management.component.css']
})
export class ManagementComponent implements OnInit {

  constructor(private managementService:ManagementService, 
    private customerService:CustomerService, private complaintsService:ComplaintsService) { }

  complaint!: Complaints;
  complaints_id!: Number;
  complaints!:Complaints[];
  customers!: Customer[];
  customer!:Customer;
  ngOnInit(): void {
    this.complaint = {
      cart_id: 0,
      customer_id: 0,
      complaints: "0",
    }
    // this.id = 0;
    this.getAllComplaints();
    this.getAllCustomers();
  }

  getAllComplaints(){
    this.complaintsService.viewComplaints().subscribe((complaints:Complaints[])=>{
      this.complaints = complaints;
      console.log(complaints);
    })
  }

  removeComplaint(id:number){
    
    console.log(id);
    this.complaintsService.deleteComplaints(id);
    setTimeout(()=>{ this.ngOnInit()}, 500)
   
  }

  getAllCustomers(){
    this.customerService.getAllCustomers().subscribe((customers:Customer[])=>{
      this.customers = customers;
      console.log(customers);
    })
  }

  
  ban(){
    console.log(this.customer)
    this.managementService.ban(this.customer);
  }
}
