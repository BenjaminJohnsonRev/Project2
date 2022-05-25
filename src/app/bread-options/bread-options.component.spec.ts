import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BreadOptionsComponent } from './bread-options.component';

describe('BreadOptionsComponent', () => {
  let component: BreadOptionsComponent;
  let fixture: ComponentFixture<BreadOptionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BreadOptionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BreadOptionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
