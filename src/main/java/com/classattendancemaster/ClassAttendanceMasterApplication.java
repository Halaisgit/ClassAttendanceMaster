package com.classattendancemaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassAttendanceMasterApplication {
//    @Autowired
//    AttendanceListDAOImpl attendanceListDAO;
//    @Autowired
//    SubjectDAOImpl subjectDAO;
//    @Autowired
//    LecturerDAOImpl lecturerDAO;
//    @Autowired
//    StudentDAOImpl studentDAO;

    public static void main(String[] args) {
        SpringApplication.run(ClassAttendanceMasterApplication.class, args);
    }

//    @PostConstruct
//    public void start(){
//        Lecturer lecturer = new Lecturer("Pierwszy", "Nauczyciel", "mgr.inz");
//        Subject subject = new Subject(SubjectType.Excercises, "PT cw");
//        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        Student student = new Student("Jan", "Nowak", "122011");
//        Student student2 = new Student("Adrian", "Nowak", "122066");
//        List<Student> students = new ArrayList<>();
//        students.add(student2);
//        students.add(student);
//        LocalDateTime date = LocalDateTime.now();
//        String dates = date.format(formatter);
//        AttendanceList attendanceList = new AttendanceList("Lab PT", dates, students, subject, lecturer);
//        subjectDAO.save(subject);
//        lecturerDAO.save(lecturer);
//        studentDAO.save(student);
//        studentDAO.save(student2);
//        attendanceListDAO.save(attendanceList);
//
//    }
}
