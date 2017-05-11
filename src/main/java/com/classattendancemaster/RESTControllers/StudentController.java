package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.StudentDAOImpl;
import com.classattendancemaster.Entities.Student;
import com.classattendancemaster.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Konrad on 2017-04-06.
 */

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentDAOImpl studentDAO;

    @Autowired
    public StudentController(StudentDAOImpl studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable long id) {
        return studentDAO.findById(id);
    }

    @GetMapping("/getall")
    public List<Student> getAll() {
        return studentDAO.findAll();
    }

}
