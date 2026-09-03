/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityregistrationsystem;

/**
 *
 * @author KA
 */
public class Student {

    private int studentId;
    private String studentName;
    private String department;

    public Student(int studentId, String studentName, String department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
    }

    //getter
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    //setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", department=" + department + '}';
    }

}
