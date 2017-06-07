package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.StudentDAOImpl;
import com.classattendancemaster.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Konrad on 2017-04-06.
 */

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentDAOImpl studentDAO;

    @Autowired
    public StudentController(StudentDAOImpl studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/{id}")
    public Student findOne(@PathVariable long id) {
        return studentDAO.findOne(id);
    }

    @GetMapping("")
    public List<Student> getAll() {
        return studentDAO.findAll();
    }

    @RequestMapping("/create")
    public void create(@RequestBody Student student) {
        Student studentDummy = studentDAO.findByAlbumNumber(student.getAlbumNumber());
        if (studentDummy == null) {
            studentDAO.save(student);
        }
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        Student studentDummy = studentDAO.findOne(id);
        studentDAO.delete(studentDummy);
    }

}
