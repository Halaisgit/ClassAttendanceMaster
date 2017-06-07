import {Component, OnInit} from '@angular/core';
import {StudentService} from '../services/students.service';
import {Students} from '../interfaces/students.interface';

@Component({

  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css'],
  providers: [StudentService]
})
export class StudentsComponent implements OnInit {

  students: Students[];
  constructor(private postService: StudentService) {
    this.students = [];
    this.postService.getStudents().subscribe(students => this.students = this.students.concat(students));
  }

  ngOnInit() {
  }

}
