import { Component, OnInit } from '@angular/core';
import {SubjectService} from '../services/subject.service';
import {Subject} from '../interfaces/subject';

@Component({
  selector: 'app-subject',
  templateUrl: './subject.component.html',
  styleUrls: ['./subject.component.css'],
  providers: [SubjectService]
})
export class SubjectComponent implements OnInit {

  subjects: Subject[];
  constructor(private subjectService: SubjectService) {
    this.subjects = [];
    this.subjectService.getSubject().subscribe(subject => this.subjects = this.subjects.concat(subject));
  }

  ngOnInit() {
  }

}
