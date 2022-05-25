import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styles:[
    `.modal{background: rgba(0,0,0, .5)};`
  ],
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'megabites-app';
  ngOnInit() {
   }

}
