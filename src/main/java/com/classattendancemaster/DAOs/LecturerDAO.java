package com.classattendancemaster.DAOs;

import com.classattendancemaster.Entities.Lecturer;

import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface LecturerDAO {
    Lecturer findOne(Long id);
    Lecturer findByFirstNameAndLastName(String firstName, String lastName);
    void save (Lecturer lecturer);
    List<Lecturer> findAll();
}
