import {Component, OnInit} from '@angular/core';
import {AttendanceService} from '../services/attendance.service';
import {Attendance} from '../interfaces/attendance';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-attendance-details',
  templateUrl: './attendance-details.component.html',
  styleUrls: ['./attendance-details.component.css'],
  providers: [AttendanceService]
})
export class AttendanceDetailsComponent implements OnInit {
  attendanceList: Attendance;
  private eventID: number = 0;

  constructor(private attendanceService: AttendanceService, private activatedRoute: ActivatedRoute) {
    this.activatedRoute.params.subscribe(param => {
      this.eventID = +param['id'];
      console.log(this.eventID);
      console.log(this.attendanceList);
    });
    this.attendanceService.getOne(this.eventID).subscribe(attendance => this.attendanceList = attendance);
  }

  ngOnInit() {
  }
}
