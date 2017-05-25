import {Http, Response} from '@angular/http';
import 'rxjs/add/operator/map';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs/Observable';
import {Students} from '../interfaces/students.interface';
/**
 * Created by Konrad on 2017-05-24.
 */

@Injectable()
export class StudentService {

  private _studentsUrl = 'http://localhost:4200/students';

  private _subjectUrl = 'http://localhost:4200/subject';
  constructor(private _http: Http) {
  }

  getStudents(): Observable<Students[]> {
    return this._http.get(this._studentsUrl).map((res: Response) => res.json());
  }

}
