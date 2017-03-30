package com.classattendancemaster.Repositories;

import com.classattendancemaster.Entities.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Arges on 30.03.2017.
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findAll();
}
