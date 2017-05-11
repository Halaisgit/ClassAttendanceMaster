package com.classattendancemaster.DAOImpl;

import com.classattendancemaster.DAOs.SubjectDAO;
import com.classattendancemaster.Entities.Subject;
import com.classattendancemaster.Enum.SubjectType;
import com.classattendancemaster.Repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
@Repository
@Transactional
public class SubjectDAOImpl implements SubjectDAO {

    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectDAOImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

//    @Override
//    public Subject findByName(String name) {
//        return subjectRepository.findByName(name);
//    }

    @Override
    public Subject findByNameAndSubjectType(String name, SubjectType subjectType) {
        return subjectRepository.findByNameAndSubjectType(name, subjectType);
    }

    @Override
    public void save(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }
}
