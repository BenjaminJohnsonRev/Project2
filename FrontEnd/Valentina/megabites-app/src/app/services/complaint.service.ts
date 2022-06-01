import { Complaint } from './../complaint';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ComplaintService {

  constructor(private http:HttpClient) { }

  addComplaint(complaint:Complaint){
    console.log(complaint);
    return this.http.post<Complaint>('http://localhost:9002/complaints/', complaint);
  }

  getComplaintById(id:Number){
    return this.http.get<Complaint>('http://localhost:9002/complaints/'+id);
  }

  getComplaintsByCustomerId(id?:Number){
    return this.http.get<Complaint[]>('http://localhost:9002/complaints/customer/'+id);
  }

  getAllComplaints(){
    return this.http.get<Complaint[]>('http://localhost:9002/complaints/');
  }

  updateComplaint(complaint:Complaint){
    return this.http.put<Complaint>('http://localhost:9002/complaints/', complaint);
  }

  deleteComplaintById(id:number){
    return this.http.delete<Complaint>('http://localhost:9002/complaints/'+id);
  }
}
