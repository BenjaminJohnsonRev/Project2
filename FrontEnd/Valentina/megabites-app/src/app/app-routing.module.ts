import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { UserAuthenticationComponent } from './user-authentication/user-authentication.component';
import { BuildSandwichComponent } from './build-sandwich/build-sandwich.component';
import { ManagementComponent } from './management/management.component';
import { ComplaintComponent } from './complaint/complaint.component';

const routes: Routes = [
  {path: 'build-sandwich',component:BuildSandwichComponent},
  {path: 'management',component:ManagementComponent},
  {path: 'complaint',component:ComplaintComponent}

]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
