import {Component, OnInit} from '@angular/core';
import {AttendanceService} from '../services/attendance.service';
import {Attendance} from '../interfaces/attendance';

@Component({
  selector: 'app-attendance',
  templateUrl: './attendance.component.html',
  styleUrls: ['./attendance.component.css'],
  providers: [AttendanceService]
})
export class AttendanceComponent implements OnInit {
  attendances: Attendance[];
  constructor(private attendanceService: AttendanceService) {
    this.attendances = [];
    this.attendanceService.getAttendanceList().subscribe(attendance => this.attendances = this.attendances.concat(attendance));
  }

  ngOnInit() {
  }

}
