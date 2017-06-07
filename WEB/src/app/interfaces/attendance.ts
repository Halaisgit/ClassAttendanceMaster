import {Students} from './students.interface';
import {Lecturer} from './lecturer';
import {Subject} from './subject';
export interface Attendance {
  name: string,
  dateTime: string,
  studentList?: Students,
  lecturer?: Lecturer,
  subject?: Subject,
  id: number
}
