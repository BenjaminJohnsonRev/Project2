import { Component, OnInit } from '@angular/core';
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
  id?: number;
  ngOnInit(): void {
    this.complaint = {
      complaints_id: 0,
      cart_id: 0,
      customer_id: 0,
      complaints: "0",
    }
    this.complaints_id = 0;
    this.getAllComplaints();
    this.getAllCustomers();
    // this.removeComplaint();
  }

  getAllComplaints(){
    this.complaintsService.viewComplaints().subscribe((complaints:Complaints[])=>{
      console.log(complaints);
    })
  }

  removeComplaint(){
    console.log(this.complaints_id)
    this.complaintsService.deleteComplaints(this.complaints_id);
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
