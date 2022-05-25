import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BreadOptionsComponent } from './bread-options/bread-options.component';
import { MeatOptionsComponent } from './meat-options/meat-options.component';
import { VegOptionsComponent } from './veg-options/veg-options.component';
import { SeasOptionsComponent } from './seas-options/seas-options.component';
import { SauceOptionsComponent } from './sauce-options/sauce-options.component';

@NgModule({
  declarations: [
    AppComponent,
    BreadOptionsComponent,
    MeatOptionsComponent,
    VegOptionsComponent,
    SeasOptionsComponent,
    SauceOptionsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
