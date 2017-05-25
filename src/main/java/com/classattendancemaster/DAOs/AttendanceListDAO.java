package com.classattendancemaster.DAOs;

import com.classattendancemaster.Entities.AttendanceList;

import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
public interface AttendanceListDAO {
    void save(AttendanceList attendanceList);
    AttendanceList findOne(Long id);
    List<AttendanceList> findAll();
}
