import {SubjectType} from './subject-type';
export interface Subject {
  id: number,
  subjectType?: SubjectType,
  name: string
}
