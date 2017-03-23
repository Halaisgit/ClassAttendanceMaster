package com.classattendancemaster.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity
public class Pracownik {
    @Id
    @GeneratedValue
    private long Id;

    private String firstName;
    private String lastName;
    private String title;

    @OneToOne
    private Wydzial wydzial;

    public Wydzial getWydzial() {
        return wydzial;
    }

    public void setWydzial(Wydzial wydzial) {
        this.wydzial = wydzial;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
