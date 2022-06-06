import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-build-sandwich',
  templateUrl: './build-sandwich.component.html',
  styleUrls: ['./build-sandwich.component.css']
})
export class BuildSandwichComponent implements OnInit {

customer_LoggedIn!:Boolean;

  constructor() { }

  ngOnInit(): void {
    // this.customer_LoggedIn=history.state.customer_LoggedIn;
  }

  logout(){
    window.open('http://localhost:4200/','_self')?.focus();
  }

}
