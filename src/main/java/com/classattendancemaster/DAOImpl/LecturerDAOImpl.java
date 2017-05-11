package com.classattendancemaster.DAOImpl;

import com.classattendancemaster.DAOs.LecturerDAO;
import com.classattendancemaster.Entities.Lecturer;
import com.classattendancemaster.Repositories.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
@Repository
@Transactional
public class LecturerDAOImpl implements LecturerDAO {

    private final LecturerRepository lecturerRepository;

    @Autowired
    public LecturerDAOImpl(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public Lecturer findOne(Long id) {
        return lecturerRepository.findOne(id);
    }

    @Override
    public Lecturer findByFirstNameAndLastName(String firstName, String lastName) {
        return lecturerRepository.findByFirstNameAndLastName(firstName, lastName);
    }


    @Override
    public void save(Lecturer lecturer) {
        lecturerRepository.save(lecturer);

    }

    @Override
    public List<Lecturer> findAll() {
        return lecturerRepository.findAll();
    }
}
