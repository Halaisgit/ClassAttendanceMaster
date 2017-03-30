package com.classattendancemaster.Repositories;

import com.classattendancemaster.Entities.AttendingClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Arges on 30.03.2017.
 */
public interface AttendingClassRepository extends CrudRepository<AttendingClass, Long> {
}
