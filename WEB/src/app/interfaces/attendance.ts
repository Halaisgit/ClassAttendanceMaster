import {Students} from './students.interface';
import {Lecturer} from './lecturer';
import {Subject} from './subject';
export interface Attendance {
  name: string,
  localDateTime?: {
    dayOfMonth: number,
    dayOfWeek: string,
    dayOfYear: number,
    month: string,
    monthValue: number,
    year: number,
    hour: number,
    minute: number,
    nano: number,
    second: number,
    chronology?: {
      id: string,
      calendarType: string
    }
  },
  studentList?: Students,
  lecturer?: Lecturer,
  subject?: Subject,
  id: number
}
