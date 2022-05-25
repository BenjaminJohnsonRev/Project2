import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BuildSandwichComponent } from './build-sandwich.component';

describe('BuildSandwichComponent', () => {
  let component: BuildSandwichComponent;
  let fixture: ComponentFixture<BuildSandwichComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BuildSandwichComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BuildSandwichComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
