package com.classattendancemaster.DAOs;

import com.classattendancemaster.Entities.Student;

import java.util.List;

/**
 * Created by Arges on 30.03.2017.
 */
public interface StudentDAO {
    List<Student> findAll();
    Student findById(Long id);
}
