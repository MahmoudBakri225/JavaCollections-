package com.mycompany.universityregistrationsystem;

public class Registration {

    private Student student;
    private Course course;
    private String status;

    
    // constactor
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
