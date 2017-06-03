import {inject, TestBed} from '@angular/core/testing';

import {SubjectService} from './subject.service';

describe('LecturerService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SubjectService]
    });
  });

  it('should ...', inject([SubjectService], (service: SubjectService) => {
    expect(service).toBeTruthy();
  }));
});
