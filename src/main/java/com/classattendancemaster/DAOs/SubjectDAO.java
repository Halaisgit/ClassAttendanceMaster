package com.classattendancemaster.DAOs;

import com.classattendancemaster.Entities.Subject;
import com.classattendancemaster.Enum.SubjectType;

import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface SubjectDAO {
    Subject findByNameAndSubjectType(String name, SubjectType subjectType);
    void save(Subject subject);
    List<Subject> findAll();
}
