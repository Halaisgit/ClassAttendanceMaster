import {inject, TestBed} from '@angular/core/testing';

import {LecturerService} from './lecturer.service';

describe('LecturerService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LecturerService]
    });
  });

  it('should ...', inject([LecturerService], (service: LecturerService) => {
    expect(service).toBeTruthy();
  }));
});
