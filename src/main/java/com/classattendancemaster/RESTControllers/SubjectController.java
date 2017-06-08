package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.SubjectDAOImpl;
import com.classattendancemaster.Entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Konrad on 2017-05-11.
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {
    private final SubjectDAOImpl subjectDAO;

    @Autowired
    public SubjectController(SubjectDAOImpl subjectDAO) {
        this.subjectDAO = subjectDAO;
    }
    @GetMapping("")
    public List<Subject> getAll(){
        return  subjectDAO.findAll();
    }
    @RequestMapping("/create")
    public void create(@RequestBody Subject subject){
        if(subject!= null) {
            subjectDAO.save(subject);
        }
    }

}
