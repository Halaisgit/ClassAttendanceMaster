package com.classattendancemaster.Repositories;

import com.classattendancemaster.Entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface LecturerRepository extends CrudRepository<Lecturer, Long> {
    Lecturer findOne(Long id);
    Lecturer findByFirstNameAndLastName(String firstName, String lastName);
    List<Lecturer> findAll();
}
