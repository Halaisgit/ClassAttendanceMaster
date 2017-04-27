package com.classattendancemaster.DAOs;

import com.classattendancemaster.Entities.Subject;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface SubjectDAO {
    Subject findByName(String name);
    void save(Subject subject);
}
