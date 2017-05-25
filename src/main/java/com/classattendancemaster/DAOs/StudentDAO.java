package com.classattendancemaster.DAOs;

import com.classattendancemaster.Entities.Student;

import java.util.List;

/**
 * Created by Arges on 30.03.2017.
 */
public interface StudentDAO {
    List<Student> findAll();
    Student findOne(Long id);
    void save(Student student);
    Student findByAlbumNumber(String albumNumber);
    void delete(Student student);
}
