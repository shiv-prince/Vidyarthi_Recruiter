package com.example.vidyarthirecruiter;

public class Student {
    private String name;
    private String collegeName;
    private String gpa;
    private String score;

    public Student(String name, String collegeName, String gpa, String score) {
        this.name = name;
        this.collegeName = collegeName;
        this.gpa = gpa;
        this.score = score;
    }
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
