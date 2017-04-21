package com.classattendancemaster.Entities;

import com.classattendancemaster.Enum.Enumerators;
import com.classattendancemaster.Enum.Enumerators.SubjectType;

import javax.persistence.*;

/**
 * Created by Konrad on 2017-04-20.
 */
@Entity
public class AttendanceClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_class_id")
    private Long id;
    private SubjectType subjectType;
    private String name;
}
