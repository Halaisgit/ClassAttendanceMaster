package com.classattendancemaster.DAOImpl;

import com.classattendancemaster.DAOs.StudentDAO;
import com.classattendancemaster.Entities.Student;
import com.classattendancemaster.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Arges on 30.03.2017.
 */
@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {
    private final StudentRepository repository;
    @Autowired
    public StudentDAOImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }


    @Override
    public Student findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public Student findByAlbumNumber(String albumNumber) {
        return repository.findByAlbumNumber(albumNumber);
    }

    @Override
    public void delete(Student student) {
        repository.delete(student);
    }
}
