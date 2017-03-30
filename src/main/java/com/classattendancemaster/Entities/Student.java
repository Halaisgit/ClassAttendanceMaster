package com.classattendancemaster.Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity(name="students")
public class Student {
    @Id
    @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    private String albumNumber;

//    @OneToMany(mappedBy = "students")
//    private List<AttendingClass> attendingClass;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//
//    public AttendingClass getAttendingClass() {
//        return attendingClass;
//    }
//
//    public void setAttendingClass(AttendingClass aclass) {
//        this.attendingClass = aclass;
//    }
}

