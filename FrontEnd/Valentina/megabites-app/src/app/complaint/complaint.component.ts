import { Customer } from './../customer';
import { UserAuthenticationComponent } from './../user-authentication/user-authentication.component';
import { Complaint } from './../complaint';
import { ComplaintService } from './../services/complaint.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-complaint',
  templateUrl: './complaint.component.html',
  styleUrls: ['./complaint.component.css']
})
export class ComplaintComponent implements OnInit {
  complaints:Complaint[] = [];
  currentCustomerId!: Number;
  customerComponent!: UserAuthenticationComponent;
  

  constructor(private complaintService:ComplaintService) { }

  ngOnInit(): void {
    this.currentCustomerId = this.customerComponent.getCustomer().customer_id!;
    this.getComplaintsByCustomerId();
  }

 
  getComplaintsByCustomerId(){
    this.complaintService.getComplaintsByCustomerId(this.currentCustomerId).subscribe((complaints:Complaint[])=>{
      this.complaints = complaints;
      console.log(complaints);
    })
  }


  complaint!:Complaint;
  complain(){
    this.complaintService.addComplaint(this.complaint);
  }

}
