package com.classattendancemaster.DAOImpl;

import com.classattendancemaster.DAOs.StudentDAO;
import com.classattendancemaster.Entities.Student;
import com.classattendancemaster.Repositories.StudentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Arges on 30.03.2017.
 */
@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }


    @Override
    public Student findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }
}
