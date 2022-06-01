import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Complaints } from '../complaints';

@Injectable({
  providedIn: 'root'
})
export class ComplaintsService {

  constructor(private http:HttpClient) { }

  viewComplaints(){
    return this.http.get<Complaints[]>('http://localhost:9002/complaints');
  }

  deleteComplaints(id: number){
    console.log("Delete Function: "+ id)
    return this.http.delete('http://localhost:9002/complaints/' + id).subscribe();
  }

  // viewComplaints(customer_id){
  // }

  // viewComplaints(complaints_id){}

  
}
