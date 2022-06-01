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

  complaint:Complaint = {} as Complaint;
  complaints:Complaint[] = [];
  currentCustomerId!: Number;
  customerComponent!: UserAuthenticationComponent;
  

  constructor(private complaintService:ComplaintService) { }

  ngOnInit(): void {
    this.currentCustomerId = this.customerComponent.getCustomer().customer_id as number;
    this.getComplaintsByCustomerId();
  }

 
  getComplaintsByCustomerId(){
    this.complaintService.getComplaintsByCustomerId(this.currentCustomerId).subscribe((complaints:Complaint[])=>{
      this.complaints = complaints;
      console.log(complaints);
    })
  }


  
  complain(ComplaintInput: string){
    this.complaint.complaints = ComplaintInput;
    console.log(this.complaint.complaints);
    this.complaintService.addComplaint(this.complaint);
  }

}
