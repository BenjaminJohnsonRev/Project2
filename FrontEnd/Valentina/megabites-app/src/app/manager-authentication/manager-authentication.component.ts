import { Component, OnInit } from '@angular/core';
import { Manager } from '../manager';
import { ManagementService } from '../services/management.service';

@Component({
  selector: 'app-manager-authentication',
  templateUrl: './manager-authentication.component.html',
  styleUrls: ['./manager-authentication.component.css']
})
export class ManagerAuthenticationComponent implements OnInit {

  manager!: Manager;
  table_manager!: Manager;

  constructor(private managementService:ManagementService) { }


  ngOnInit(): void {
    this.manager={
      username: '',
      password: '',
      first_name: '',
      last_name: '',
      years_of_experience: 0
    }
  }
  display = "grid";

  login(){
    this.managementService.login(this.manager).subscribe(
      table_manager=>{this.manager=table_manager;
      console.log(table_manager);
      if(table_manager==null){
        window.open('http://localhost:4200/','_self')?.focus();
      }
      else{
        this.display = "none";
      }
    }
    )

    

  }



  onCloseHandled() {
    this.display = "none";
    window.open('http://localhost:4200/','_self')?.focus();
  }


}
