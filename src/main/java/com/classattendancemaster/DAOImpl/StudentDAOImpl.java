package com.classattendancemaster.DAOImpl;

import com.classattendancemaster.DAOs.StudentDAO;
import com.classattendancemaster.Entities.Student;
import com.classattendancemaster.Repositories.StudentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Arges on 30.03.2017.
 */
@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO
{
    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Autowired
    private StudentRepository repository;
    @Override
    public List<Student> findAll(){
        return repository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return null;
    }
}
