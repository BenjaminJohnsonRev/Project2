import { Component, OnInit } from '@angular/core';
import { Sandwich } from '../sandwich';
import { SandwichService } from '../services/sandwich.service';
import { Meat } from '../meat';
import { Bread } from '../bread';
import { Sauce } from '../sauce';
import { Vegetable } from '../vegetable';
import { Seasoning } from '../seasoning';
import { BreadService } from '../services/bread.service';
import { MeatService } from '../services/meat.service';
import { VegetableService } from '../services/vegetable.service';
import { SeasoningService } from '../services/seasoning.service';
import { SauceService } from '../services/sauce.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-add-sandwich',
  templateUrl: './add-sandwich.component.html',
  styleUrls: ['./add-sandwich.component.css']
})
export class AddSandwichComponent implements OnInit {

  sandwich!: Sandwich;
  breads!: Bread[];
  meats!: Meat[];
  vegetables!: Vegetable[];
  seasonings!: Seasoning[];
  sauces!: Sauce[];

  bread!:Bread;
  meat! :Meat;
  vegetable!:Vegetable;
  seasoning!:Seasoning;
  sauce!:Sauce;

  constructor(private sandwichService:SandwichService,
     private breadService:BreadService,
     private meatService:MeatService,
     private vegetableService:VegetableService,
     private seasoningService:SeasoningService,
     private sauceService:SauceService) { }

  ngOnInit(): void {
    // this.sandwich = {
    //     sandwich_id: 0,
    //     bread: {
    //         id: 0,
    //         name: '',
    //         price: 0.0
    //     },
    //     meat: {
    //         id: 0,
    //         name: '',
    //         price: 0.0
    //     },
    //     vegetable: {
    //         id: 0,
    //         name: '',
    //         price: 0.0
    //     },
    //     sauce: {
    //         id: 0,
    //         name: '',
    //         price: 0.0
    //     },
    //     seasoning: {
    //         id: 0,
    //         name: '',
    //         price: 0.0
    //     }
    // }

    this.getAllBread();
    this.getAllMeat();
    this.getAllSauce();
    this.getAllVegetable();
    this.getAllSeasoning();
    
    // this.getAllVegetable();

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

  getAllVegetable(){
    this.vegetableService.getAllVegetable().subscribe((vegetables:Vegetable[])=>{
      this.vegetables = vegetables;
      console.log(vegetables);
    })
  }
  getAllSeasoning(){
    this.seasoningService.getAllSeasoning().subscribe((seasonings:Seasoning[])=>{
      this.seasonings = seasonings;
      console.log(seasonings);
    })
  }
  getAllSauce(){
    this.sauceService.getAllSauce().subscribe((sauces:Sauce[])=>{
      this.sauces = sauces;
      console.log(sauces);
    })
  }
    

  // buildSandwich() {
  //   this.sandwichService.buildSandwich(this.bread, this.meat, this.vegetable, this.sauce, this.seasoning);
  // }

  addSandwich() {
    console.log(this.sandwich);
    // buildSandwich();
  }
}

