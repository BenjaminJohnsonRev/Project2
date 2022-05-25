import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SauceOptionsComponent } from './sauce-options.component';

describe('SauceOptionsComponent', () => {
  let component: SauceOptionsComponent;
  let fixture: ComponentFixture<SauceOptionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SauceOptionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SauceOptionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
