package com.classattendancemaster.Repositories;

import com.classattendancemaster.Entities.Subject;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface SubjectRepository extends CrudRepository<Subject, Long> {
    Subject findByName(String name);
}
