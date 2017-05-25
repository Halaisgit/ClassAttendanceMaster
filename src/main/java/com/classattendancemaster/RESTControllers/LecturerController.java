package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.LecturerDAOImpl;
import com.classattendancemaster.Entities.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Konrad on 2017-05-11.
 */
@RestController
@RequestMapping("/lecturer")
public class LecturerController {
    private final LecturerDAOImpl lecturerDAO;


    @Autowired
    public LecturerController(LecturerDAOImpl lecturerDAO) {
        this.lecturerDAO = lecturerDAO;
    }

    @RequestMapping("")
    public List<Lecturer> getAll() {
        return lecturerDAO.findAll();
    }

    @RequestMapping("/create")
    public Lecturer create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String title) {
        Lecturer testLecturer = lecturerDAO.findByFirstNameAndLastName(firstName, lastName);
        if (testLecturer == null) {
            Lecturer lecturer = new Lecturer(firstName, lastName, title);
            lecturerDAO.save(lecturer);
            return lecturer;
        } else
            return null;
    }
}
