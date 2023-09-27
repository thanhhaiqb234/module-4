package com.example.form_dang_ky.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "varchar(50) not null")
    private String name;

    @Column(columnDefinition = "varchar(10) not null")
    private String phone;

    @Column(columnDefinition = "int not null")
    private int year;
    @Column(columnDefinition = "varchar(100) not null")
    private String email;

    public User() {
    }

    public User(int id, String name, String phone, int year, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.year = year;
        this.email = email;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
