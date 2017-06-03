/**
 * Created by Hala on 2017-06-03.
 */

import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import {Subject} from '../interfaces/subject';
import 'rxjs/add/operator/map';

@Injectable()
export class SubjectService {

  private _subjectUrl = 'http://localhost:4200/subject';
  constructor(private _http: Http) {
  }

  getSubject(): Observable<Subject[]> {
    return this._http.get(this._subjectUrl).map((res: Response) => res.json());
  }

}
