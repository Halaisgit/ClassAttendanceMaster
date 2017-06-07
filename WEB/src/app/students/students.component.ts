import {Component, Input, OnInit} from '@angular/core';
import {StudentService} from '../services/students.service';
import {Students} from '../interfaces/students.interface';

@Component({

  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css'],
  providers: [StudentService]
})
export class StudentsComponent implements OnInit {

  @Input()
  students: Students[];
  constructor(private studentService: StudentService) {
    this.students = [];
    this.studentService.getStudents().subscribe(students => this.students = this.students.concat(students));
  }

  create(data: Students) {
    if(data) {
      this.studentService.addStudent(data).subscribe(() => this.getStudents());
      data = null;
    }
  }

  getStudents() {
    this.students = [];
    this.studentService.getStudents().subscribe(students => this.students = this.students.concat(students));
  }

  deleteStudent(id) {
    this.studentService.deleteStudentById(id).subscribe(() => this.getStudents());
  }

  ngOnInit() {
  }

}
