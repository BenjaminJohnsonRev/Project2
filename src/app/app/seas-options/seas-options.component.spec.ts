import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeasOptionsComponent } from './seas-options.component';

describe('SeasOptionsComponent', () => {
  let component: SeasOptionsComponent;
  let fixture: ComponentFixture<SeasOptionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SeasOptionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SeasOptionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
