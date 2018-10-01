package com.goodjwon.infrun.intellj.chap4;

public class Student {

    private Long id;
    private String email;
    private String name;

    //getter setter command + N
    public Student() {
    }

    //getter setter command + N
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}