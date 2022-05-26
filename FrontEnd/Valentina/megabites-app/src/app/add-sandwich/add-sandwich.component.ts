import { Component, OnInit } from '@angular/core';
import { Sandwich } from '../sandwich';
import { SandwichService } from '../services/sandwich.service';

@Component({
  selector: 'app-add-sandwich',
  templateUrl: './add-sandwich.component.html',
  styleUrls: ['./add-sandwich.component.css']
})
export class AddSandwichComponent implements OnInit {

  sandwich!: Sandwich;

  constructor(private sandwichService:SandwichService) { }

  ngOnInit(): void {
    this.sandwich = {
      cart_id: 0,
      cost: 0,
      cart_date: new Date,
      sandwiches: [
        {
          "sandwich_id": 0,
          "bread": {
              "id": 0,
              "name": '',
              "price": 0.0
          },
          "meat": {
              "id": 0,
              "name": '',
              "price": 0.0
          },
          "vegetable": {
              "id": 0,
              "name": '',
              "price": 0.0
          },
          "sauce": {
              "id": 0,
              "name": '',
              "price": 0.0
          },
          "seasoning": {
              "id": 0,
              "name": '',
              "price": 0.0
          }
      }
      ]
    }
  }

  addSandwich() {
    // this.sandwichService.addSandwich(this.sandwich).subscribe(
    //   sandwich => console.log(sandwich)
    // );
  }

}