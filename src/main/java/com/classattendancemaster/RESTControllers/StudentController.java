package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.StudentDAOImpl;
import com.classattendancemaster.Entities.Student;
import com.classattendancemaster.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Konrad on 2017-04-06.
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentDAOImpl studentDAO;

    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable long id){
        return studentDAO.findById(id);
    }

    @GetMapping("/getall")
    public List<Student> getAll(){
        return studentDAO.findAll();
    }

}
