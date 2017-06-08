import {Injectable} from '@angular/core';
import {Headers, Http, RequestOptions, Response} from '@angular/http';
import {Observable} from 'rxjs';
import 'rxjs/add/operator/map';
import {Attendance} from '../interfaces/attendance';
import {Students} from '../interfaces/students.interface';

@Injectable()
export class AttendanceService {
  private _attendanceUrl = 'http://localhost:4200/attendance';
  private _getOneAttendanceUrl = 'http://localhost:4200/attendance/';
  private _addStudentToListUrl = 'http://localhost:4200/attendance/';

  constructor(private http: Http) {
  }

  getAttendanceList(): Observable<Attendance[]> {
    return this.http.get(this._attendanceUrl).map((res: Response) => res.json());
  }

  getOne(id): Observable<Attendance> {
    return this.http.get(this._getOneAttendanceUrl + id).map(this.extractData);
  }

  addStudentToList(data: any, id): Observable<Students> {
    let headers = new Headers({'Content-Type': 'application/json'});
    let options = new RequestOptions({ headers: headers });
    console.log(data);
    return this.http.post(this._addStudentToListUrl + id + '/students/add', JSON.stringify(data), options).map(this.extractData);
  }

  private extractData(res: Response) {
    return res.json() || {};
  }
}
