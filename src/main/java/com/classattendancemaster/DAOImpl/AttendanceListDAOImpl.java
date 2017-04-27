package com.classattendancemaster.DAOImpl;

import com.classattendancemaster.DAOs.AttendanceListDAO;
import com.classattendancemaster.Entities.AttendanceList;
import com.classattendancemaster.Repositories.AttendanceListRepository;
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
public class AttendanceListDAOImpl implements AttendanceListDAO {
    private final AttendanceListRepository attendanceListRepository;

    @Autowired
    public AttendanceListDAOImpl(AttendanceListRepository attendanceListRepository) {
        this.attendanceListRepository = attendanceListRepository;
    }

    @Override
    public void save(AttendanceList attendanceList) {
        attendanceListRepository.save(attendanceList);
    }
}
