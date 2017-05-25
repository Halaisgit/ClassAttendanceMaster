import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import {Attendance} from '../interfaces/attendance';

@Injectable()
export class AttendanceService {
  private _attendanceUrl = 'http://localhost:4200/attendance';

  constructor(private http:Http) { }

  getAttendanceList(): Observable<Attendance[]> {
    return this.http.get(this._attendanceUrl).map((res: Response) => res.json())
  }

}
