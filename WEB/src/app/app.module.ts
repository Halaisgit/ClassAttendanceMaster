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
import {LecturerComponent} from './lecturer/lecturer.component';
import {routing} from './app.routes';
import {MainComponent} from './main/main.component';
import {NavbarComponent} from './navbar/navbar.component';
import {SubjectService} from './services/subject.service';
import {SubjectComponent } from './subject/subject.component';


@NgModule({
  declarations: [
    AppComponent,
    StudentsComponent,
    AttendanceComponent,
    LecturerComponent,
    MainComponent,
    NavbarComponent,
    SubjectComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    NgbModule.forRoot(),
    routing,
  ],
  providers: [StudentService, AttendanceService, LecturerService, SubjectService],
  bootstrap: [AppComponent]
})
export class AppModule { }
