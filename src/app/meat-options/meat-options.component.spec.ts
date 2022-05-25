import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeatOptionsComponent } from './meat-options.component';

describe('MeatOptionsComponent', () => {
  let component: MeatOptionsComponent;
  let fixture: ComponentFixture<MeatOptionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MeatOptionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MeatOptionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
