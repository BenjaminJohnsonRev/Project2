import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { UserAuthenticationComponent } from './user-authentication/user-authentication.component';
import { BuildSandwichComponent } from './build-sandwich/build-sandwich.component';
import { ManagementComponent } from './management/management.component';
import { CustomerComponent } from './customer/customer.component';
import { ComplaintComponent } from './complaint/complaint.component';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { DeliveryOrPickupComponent } from './delivery-or-pickup/delivery-or-pickup.component';
import { AddSandwichComponent } from './add-sandwich/add-sandwich.component';

const routes: Routes = [
  {path: 'build-sandwich',component:DeliveryOrPickupComponent},
  {path: 'management',component:ManagementComponent},
  {path: 'customer',component:CustomerComponent},
  {path: 'complaint', component:ComplaintComponent},
  {path: 'orders',component:CustomerOrdersComponent},
  {path: 'checkout',component:CheckoutComponent},
  {path: 'add-sandwich', component:AddSandwichComponent}

]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
