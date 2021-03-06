/**
 * Created by Konrad on 2017-05-25.
 */
import {ModuleWithProviders} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {StudentsComponent} from './students/students.component';
import {LecturerComponent} from './lecturer/lecturer.component';
import {AttendanceComponent} from './attendance/attendance.component';
import {MainComponent} from './main/main.component';
import {SubjectComponent} from './subject/subject.component';
import {AttendanceDetailsComponent} from './attendance-details/attendance-details.component';

export const routes: Routes = [
  {path: '', component: MainComponent},
  {path: 'students', component: StudentsComponent},
  {path: 'lecturer', component: LecturerComponent},
  {path: 'attendance', component: AttendanceComponent},
  {path: 'subject', component: SubjectComponent},
  {path: 'attendance/:id', component: AttendanceDetailsComponent}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(routes);
