import { Component, OnInit } from '@angular/core';
import { Meat } from '../meat';
import { Bread } from '../bread';
import { Sandwich } from '../sandwich';
import { SandwichService } from '../services/sandwich.service';
import { BreadService } from '../services/bread.service';
import { MeatService } from '../services/meat.service';

@Component({
  selector: 'app-add-sandwich',
  templateUrl: './add-sandwich.component.html',
  styleUrls: ['./add-sandwich.component.css']
})
export class AddSandwichComponent implements OnInit {

  sandwich!: Sandwich;
  breads!: Bread[];
  meats!: Meat[];

  constructor(private sandwichService:SandwichService,
     private breadService:BreadService,
     private meatService:MeatService) { }

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

    this.getAllBread();
    this.getAllMeat();
    // this.getAllVegetable();

  }

  addSandwich() {
    // this.sandwichService.addSandwich(this.sandwich).subscribe(
    //   sandwich => console.log(sandwich)
    // );
  }

  getAllBread(){
    this.breadService.getAllBread().subscribe((breads:Bread[])=>{
      this.breads = breads;
      console.log(breads);
    })
  }

  getAllMeat(){
    this.meatService.getAllMeat().subscribe((meats:Meat[])=>{
      this.meats = meats;
      console.log(meats);
    })
  }
}