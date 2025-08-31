package com.jpa_hibernate_tutorial.jpa_hibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*
* When we want to directly make the table through our class or basically connect the class to the equivalent table
* we can use Entity annotation
* in case the  table name was different than class name then
* we could use @Entity(name = 'Table name')
* in our case table name and column names exactly matches
* */
@Entity
public class Course {
    /*
     * in case the  columns name was different than class variables then
     * we could use @Column(name = 'Col name')
     * */
    @Id
    private Long id;
    private String name;
    private String author;

    public Course() {
    }

    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
