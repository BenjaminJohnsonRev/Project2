import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerAuthenticationComponent } from './manager-authentication.component';

describe('ManagerAuthenticationComponent', () => {
  let component: ManagerAuthenticationComponent;
  let fixture: ComponentFixture<ManagerAuthenticationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManagerAuthenticationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagerAuthenticationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
