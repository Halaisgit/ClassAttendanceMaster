package com.classattendancemaster.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity
public class Kierunek {

    @Id
    @GeneratedValue
    private long Id;
    private String name;
    @ManyToOne
    private Wydzial wydzial;

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

    public Wydzial getWydzial() {
        return wydzial;
    }

    public void setWydzial(Wydzial wydzial) {
        this.wydzial = wydzial;
    }
}
