import { NONE_TYPE } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor() { }

  display = "none";

  ngOnInit(): void {

  }

  logout(){
    window.open('http://localhost:4200/','_self')?.focus();
  }
}
