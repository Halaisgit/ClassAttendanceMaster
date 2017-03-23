package com.classattendancemaster.Entities;

import javax.persistence.*;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private long Id;
    private String firstName;
    private String lastName;

    @OneToMany
    private Kierunek kierunek;
    @OneToMany
    private Zajecia zajecia;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
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

    public Kierunek getKierunek() {
        return kierunek;
    }

    public void setKierunek(Kierunek kierunek) {
        this.kierunek = kierunek;
    }

    public Zajecia getZajecia() {
        return zajecia;
    }

    public void setZajecia(Zajecia zajecia) {
        this.zajecia = zajecia;
    }
}

