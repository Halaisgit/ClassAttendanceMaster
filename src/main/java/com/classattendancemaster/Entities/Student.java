package com.classattendancemaster.Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_Id")
    private Long id;
    private String firstName;
    private String lastName;
    private String albumNumber;

    public Student() {
    }

    public Student(String firstName, String lastName, String albumNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.albumNumber = albumNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAlbumNumber() {
        return albumNumber;
    }

    public void setAlbumNumber(String albumNumber) {
        this.albumNumber = albumNumber;
    }
}

