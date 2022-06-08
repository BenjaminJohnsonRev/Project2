import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeliveryOrPickupComponent } from './delivery-or-pickup.component';

describe('DeliveryOrPickupComponent', () => {
  let component: DeliveryOrPickupComponent;
  let fixture: ComponentFixture<DeliveryOrPickupComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeliveryOrPickupComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeliveryOrPickupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
