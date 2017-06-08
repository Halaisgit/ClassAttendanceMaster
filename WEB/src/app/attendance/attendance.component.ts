import {Component, OnInit} from '@angular/core';
import {AttendanceService} from '../services/attendance.service';
import {Attendance} from '../interfaces/attendance';
import {Router} from '@angular/router';
import {Students} from '../interfaces/students.interface';

@Component({
  selector: 'app-attendance',
  templateUrl: './attendance.component.html',
  styleUrls: ['./attendance.component.css'],
  providers: [AttendanceService]
})
export class AttendanceComponent implements OnInit {
  attendances: Attendance[];
  studentList: Students[];
  constructor(private attendanceService: AttendanceService, private Router: Router) {
    this.attendances = [];
    this.attendanceService.getAttendanceList().subscribe(attendance => this.attendances = this.attendances.concat(attendance));
  }

  ngOnInit() {
  }

  showDetails(id) {
    console.log(id);
    this.Router.navigate(['attendance/', id]);
    console.log(this.Router.navigate(['attendance/', id]));
  }

}
