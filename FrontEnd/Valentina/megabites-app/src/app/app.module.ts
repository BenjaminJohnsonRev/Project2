import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule, ActivatedRoute} from '@angular/router';

import { AppComponent } from './app.component';
import { UserAuthenticationComponent } from './user-authentication/user-authentication.component';
import { BuildSandwichComponent } from './build-sandwich/build-sandwich.component';
import { AddSandwichComponent } from './add-sandwich/add-sandwich.component';
import { ManagementComponent } from './management/management.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LogoutComponent } from './logout/logout.component';
import { ManagerAuthenticationComponent } from './manager-authentication/manager-authentication.component';
import { ComplaintComponent } from './complaint/complaint.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';


@NgModule({
  declarations: [
    AppComponent,
    UserAuthenticationComponent,
    BuildSandwichComponent,
    AddSandwichComponent,
    ManagementComponent,
    NavbarComponent,
    LogoutComponent,
    ManagerAuthenticationComponent,
    ComplaintComponent,
    CustomerComponent,
    CustomerOrdersComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
