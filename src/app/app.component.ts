import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MegaBites-app';

  isShow = true;

  toggleDisplay() {
    this.isShow = !this.isShow;
  }

}
