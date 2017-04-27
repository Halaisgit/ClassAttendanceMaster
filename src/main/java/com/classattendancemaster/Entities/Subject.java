package com.classattendancemaster.Entities;


import com.classattendancemaster.Enum.SubjectType;

import javax.persistence.*;

/**
 * Created by Konrad on 2017-04-20.
 */
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long id;
    private SubjectType subjectType;
    private String name;

    public Subject() {
    }

    public Subject(SubjectType subjectType, String name) {
        this.subjectType = subjectType;
        this.name = name;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
