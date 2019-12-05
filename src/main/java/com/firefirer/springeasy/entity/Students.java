package com.firefirer.springeasy.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "students")
public class Students {
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;


}

