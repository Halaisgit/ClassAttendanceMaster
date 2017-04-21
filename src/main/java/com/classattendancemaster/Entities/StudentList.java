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

}
