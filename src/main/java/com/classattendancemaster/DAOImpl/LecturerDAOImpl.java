package com.classattendancemaster.DAOImpl;

import com.classattendancemaster.DAOs.LecturerDAO;
import com.classattendancemaster.Entities.Lecturer;
import com.classattendancemaster.Repositories.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Konrad on 2017-04-27.
 */
@Repository
@Transactional
public class LecturerDAOImpl implements LecturerDAO {

    @Autowired
    LecturerRepository lecturerRepository;
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Lecturer findOne(Long id) {
        return lecturerRepository.findOne(id);
    }

    @Override
    public Lecturer findByLastName(String name) {
        return lecturerRepository.findByLastName(name);
    }

    @Override
    public void save(Lecturer lecturer) {
        lecturerRepository.save(lecturer);

    }
}
