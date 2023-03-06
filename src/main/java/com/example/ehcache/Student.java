package com.example.ehcache;

public class Student {

    private String studentName;
    private Long id;

    public Student(String studentName, Long id) {
        this.studentName = studentName;
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
