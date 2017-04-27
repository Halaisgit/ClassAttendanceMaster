package com.classattendancemaster.Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Konrad on 2017-04-20.
 */

@Entity
public class StudentList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentlist_id")
    private Long id;
    private String name;
    @OneToMany
    private List<Student> studentList;

    public StudentList() {
    }

    public StudentList(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public StudentList(String name) {
        this.name = name;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
