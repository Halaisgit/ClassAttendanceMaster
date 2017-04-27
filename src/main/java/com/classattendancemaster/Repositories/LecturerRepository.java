package com.classattendancemaster.Repositories;

import com.classattendancemaster.Entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface LecturerRepository extends CrudRepository<Lecturer, Long> {
    Lecturer findOne(Long id);
    Lecturer findByLastName(String lastName);
}
