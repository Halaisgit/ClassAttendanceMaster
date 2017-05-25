import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import {Lecturer} from '../interfaces/lecturer';
import 'rxjs/add/operator/map';

@Injectable()
export class LecturerService {
  private _lecturerUrl = 'http://localhost:4200/lecturer';

  constructor(private http:Http) { }

  getLecturer(): Observable<Lecturer[]> {
    return this.http.get(this._lecturerUrl).map((res: Response) => res.json())
  }

}
