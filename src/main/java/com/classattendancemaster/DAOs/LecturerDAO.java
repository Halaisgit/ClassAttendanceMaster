package com.classattendancemaster.DAOs;

import com.classattendancemaster.Entities.Lecturer;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface LecturerDAO {
    Lecturer findOne(Long id);
    Lecturer findByLastName(String name);
    void save (Lecturer lecturer);
}
