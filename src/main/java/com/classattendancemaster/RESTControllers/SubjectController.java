package com.classattendancemaster.RESTControllers;

import com.classattendancemaster.DAOImpl.SubjectDAOImpl;
import com.classattendancemaster.Entities.Subject;
import com.classattendancemaster.Enum.SubjectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public void create(@RequestParam String name, @RequestParam SubjectType subjectType){
        Subject testSubject = subjectDAO.findByNameAndSubjectType(name, subjectType);
        if(testSubject == null) {
            Subject subject = new Subject(subjectType, name);
            subjectDAO.save(subject);
        }
    }

}
