/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityregistrationsystem;

/**
 *
 * @author KA
 */
public class Registration {

    private Student student;
    private Course course;
    private String status;

    public Registration(Student student, Course course, String status) {
        this.student = student;
        this.course = course;
        this.status = status;
    }

    //getter
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    //setter
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Registration{" + "student=" + student + ", course=" + course + ", status=" + status + '}';
    }

}
