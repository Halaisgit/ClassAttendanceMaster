package com.classattendancemaster.Repositories;

import com.classattendancemaster.Entities.Subject;
import com.classattendancemaster.Enum.SubjectType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface SubjectRepository extends CrudRepository<Subject, Long> {
    Subject findByNameAndSubjectType(String name, SubjectType subjectType);
    List<Subject> findAll();
}
