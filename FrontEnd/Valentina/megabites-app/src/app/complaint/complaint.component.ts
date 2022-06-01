import { Customer } from './../customer';
import { UserAuthenticationComponent } from './../user-authentication/user-authentication.component';
import { Complaint } from './../complaint';
import { ComplaintService } from './../services/complaint.service';
import { Component, OnInit } from '@angular/core';
import { find } from 'rxjs';

@Component({
  selector: 'app-complaint',
  templateUrl: './complaint.component.html',
  styleUrls: ['./complaint.component.css']
})
export class ComplaintComponent implements OnInit {

  customer!: Customer;
  complaint!: Complaint;
  complaints: Complaint[] = [];
  currentCustomer!: Customer;
  customerComponent!: UserAuthenticationComponent;
  

  constructor(private complaintService:ComplaintService) { }

  ngOnInit(): void {
    this.complaint = {
      cart_id: 0,
      customer_id: Number(localStorage.getItem('customerId')),
      complaints: ''
    }

    this.getComplaintsByCustomerId();
  }

 
  getComplaintsByCustomerId(){
    this.complaintService.getComplaintsByCustomerId(this.complaint.customer_id).subscribe((complaints:Complaint[])=>{
      this.complaints = complaints;
    })
  }


  
  complain(complaintInput: string, cartIdInput: string){
    this.complaint.complaints = complaintInput;
    this.complaint.cart_id = Number(cartIdInput);
    this.complaintService.addComplaint(this.complaint).subscribe((complaint:Complaint)=>{
      console.log(complaint);
    })

    this.ngOnInit();
  }

}
