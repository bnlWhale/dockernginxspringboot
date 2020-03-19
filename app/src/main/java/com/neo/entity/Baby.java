package com.neo.entity;


import java.io.Serializable;
import java.time.LocalDate;

public class Baby implements Serializable {

    private int id;
    private String name;
    private LocalDate dob;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
