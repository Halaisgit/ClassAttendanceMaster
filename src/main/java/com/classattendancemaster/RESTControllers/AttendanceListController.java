package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.AttendanceListDAOImpl;
import com.classattendancemaster.Entities.AttendanceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Konrad on 2017-04-27.
 */
@RestController
@RequestMapping("/api/attendance")
public class AttendanceListController {

    final AttendanceListDAOImpl attendanceListDAO;

    @Autowired
    public AttendanceListController(AttendanceListDAOImpl attendanceListDAO) {
        this.attendanceListDAO = attendanceListDAO;
    }
    @GetMapping("/{id}")
    public AttendanceList get(@PathVariable Long id){
        return attendanceListDAO.findOne(id);
    }

    @GetMapping(value = "")
    public List<AttendanceList> getAll(){
        return attendanceListDAO.findAll();
    }
    @RequestMapping("/create")
    public void create(@RequestBody AttendanceList attendanceList){
        attendanceListDAO.save(attendanceList);
    }

}
