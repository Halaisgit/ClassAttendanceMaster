package com.classattendancemaster.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity
public class AttendingClass {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private LocalDateTime localDateTime;

    public AttendingClass() {
    }

    public AttendingClass(String name, LocalDateTime localDateTime) {
        this.name = name;
        this.localDateTime = localDateTime;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
