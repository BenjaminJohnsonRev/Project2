import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VegOptionsComponent } from './veg-options.component';

describe('VegOptionsComponent', () => {
  let component: VegOptionsComponent;
  let fixture: ComponentFixture<VegOptionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VegOptionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VegOptionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
