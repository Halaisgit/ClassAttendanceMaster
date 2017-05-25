import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {StudentsComponent} from './students/students.component';
import {AttendanceComponent} from './attendance/attendance.component';
import {StudentService} from './services/students.service';
import {HttpModule} from '@angular/http';
import {FormsModule} from '@angular/forms';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {AttendanceService} from './services/attendance.service';
import {LecturerService} from './services/lecturer.service';

@NgModule({
  declarations: [
    AppComponent,
    StudentsComponent,
    AttendanceComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    NgbModule.forRoot(),
  ],
  providers: [StudentService, AttendanceService, LecturerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
