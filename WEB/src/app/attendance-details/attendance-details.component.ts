import {Component, OnInit} from '@angular/core';
import {AttendanceService} from '../services/attendance.service';
import {Attendance} from '../interfaces/attendance';
import {ActivatedRoute} from '@angular/router';
import {Students} from '../interfaces/students.interface';

@Component({
  selector: 'app-attendance-details',
  templateUrl: './attendance-details.component.html',
  styleUrls: ['./attendance-details.component.css'],
  providers: [AttendanceService]
})
export class AttendanceDetailsComponent implements OnInit {
  public attendanceList: Attendance;
  private eventID: number;

  constructor(private attendanceService: AttendanceService, private activatedRoute: ActivatedRoute) {
    this.activatedRoute.params.subscribe(param => {
      this.eventID = +param['id'];
      console.log(this.eventID);
    });
    console.log(this.attendanceList);
    this.attendanceService.getOne(this.eventID).subscribe(attendance => this.attendanceList = attendance);
    console.log(this.attendanceList);
  }

  ngOnInit() {

  }

  createCard() {
    this.attendanceService.addStudentFromCard(this.eventID).subscribe( () => console.log(this));
  }

  create(data: Students) {
    if (data) {
      this.attendanceService.addStudentToList(data, this.eventID).subscribe(() =>
        this.attendanceService.getOne(this.eventID).subscribe(attendance => this.attendanceList = attendance));
      data = null;
    }
  }

}
