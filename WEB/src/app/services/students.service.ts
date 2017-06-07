import {Headers, Http, RequestOptions, Response} from '@angular/http';
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
  private _studentAddUrl = 'http://localhost:4200/students/create'
  private _studentDeleteById = 'http://localhost:4200/students/delete/';
  constructor(private _http: Http) {
  }



  getStudents(): Observable<Students[]> {
    return this._http.get(this._studentsUrl).map((res: Response) => res.json());
  }

  addStudent(data: any): Observable<Students> {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    console.log(data);
    return this._http.post(this._studentAddUrl, JSON.stringify(data), options).map(this.extractData);
  }

  deleteStudentById(id): Observable<Students[]> {
    return this._http.delete(this._studentDeleteById + id).map(this.extractData);
  }

  private extractData(res: Response) {
    let body;

    if (res.text()) {
      body = res.json();
    }

    return body || {};
  }

}
