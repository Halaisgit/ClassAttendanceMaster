package com.classattendancemaster.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity
public class Wydzial {
    @Id @GeneratedValue
    private long Id;
    private String name;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
