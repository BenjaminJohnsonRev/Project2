import { TestBed } from '@angular/core/testing';

import { SeasoningService } from './seasoning.service';

describe('SeasoningService', () => {
  let service: SeasoningService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SeasoningService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
