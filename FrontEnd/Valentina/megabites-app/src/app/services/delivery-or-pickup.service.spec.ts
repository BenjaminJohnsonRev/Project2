import { TestBed } from '@angular/core/testing';

import { DeliveryOrPickupService } from './delivery-or-pickup.service';

describe('DeliveryOrPickupService', () => {
  let service: DeliveryOrPickupService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DeliveryOrPickupService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
