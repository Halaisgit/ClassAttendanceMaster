package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.AttendanceListDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Konrad on 2017-04-27.
 */
public class AttendanceListController {
    @Autowired
    AttendanceListDAOImpl attendanceListDAO;
}
