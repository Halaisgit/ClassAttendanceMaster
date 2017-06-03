import {Component, OnInit} from '@angular/core';
import {LecturerService} from '../services/lecturer.service';
import {Lecturer} from '../interfaces/lecturer';

@Component({
  selector: 'app-lecturer',
  templateUrl: './lecturer.component.html',
  styleUrls: ['./lecturer.component.css'],
  providers: [LecturerService]
})
export class LecturerComponent implements OnInit {

  lecturers: Lecturer[];
  constructor(private lecturerService: LecturerService) {
    this.lecturers = [];
    this.lecturerService.getLecturer().subscribe(lecturer => this.lecturers = this.lecturers.concat(lecturer));
  }

  ngOnInit() {
  }

}
