package com.classattendancemaster;

import com.classattendancemaster.DAOImpl.AttendanceListDAOImpl;
import com.classattendancemaster.DAOImpl.LecturerDAOImpl;
import com.classattendancemaster.DAOImpl.StudentDAOImpl;
import com.classattendancemaster.DAOImpl.SubjectDAOImpl;
import com.classattendancemaster.Entities.AttendanceList;
import com.classattendancemaster.Entities.Lecturer;
import com.classattendancemaster.Entities.Student;
import com.classattendancemaster.Entities.Subject;
import com.classattendancemaster.Enum.SubjectType;
import com.classattendancemaster.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@SpringBootApplication
public class ClassAttendanceMasterApplication {
    @Autowired
    StudentDAOImpl studentDAO;
    @Autowired
    LecturerDAOImpl lecturerDAO;
    @Autowired
    AttendanceListDAOImpl attendanceListDAO;
    @Autowired
    SubjectDAOImpl subjectDAO;

    public static void main(String[] args) {
        SpringApplication.run(ClassAttendanceMasterApplication.class, args);
    }

//    @PostConstruct
//    public void createAttendanceList() {
//
//        subjectDAO.save(new Subject(SubjectType.Project, "PT"));
//        studentDAO.save(new Student("Kondziu", "Gabara", "122077"));
//        studentDAO.save(new Student("Adam", "Halicki", "116289"));
//        lecturerDAO.save(new Lecturer("Inny", "Nauczyciel", "mgr. inż."));
//        attendanceListDAO.save(new AttendanceList(
//                "lab6",
//                LocalDateTime.now(),
//                studentDAO.findAll(),
//                subjectDAO.findByNameAndSubjectType("PT", SubjectType.Project),
//                lecturerDAO.findByFirstNameAndLastName("Nauczyciel")));
//
//    }
}
