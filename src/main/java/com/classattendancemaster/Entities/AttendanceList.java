package com.classattendancemaster.Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity
public class AttendanceList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_Id")
    private Long Id;
    private String name;
    private String dateTime;
    @OneToMany
    private List<Student> studentList;
    @OneToOne
    private Lecturer lecturer;
    @OneToOne
    private Subject subject;
    public AttendanceList() {
    }
    public AttendanceList(String name, String dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public AttendanceList(String name, String dateTime, List<Student> studentList, Subject subject, Lecturer lecturer) {
        this.name = name;
        this.dateTime = dateTime;
        this.studentList = studentList;
        this.subject = subject;
        this.lecturer = lecturer;
    }

    public String getDateTime() {
        return dateTime;
    }

    public AttendanceList setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
