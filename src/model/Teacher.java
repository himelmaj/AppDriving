/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author himelmaj
 */
public class Teacher extends Person {

    private float salary;
    private ArrayList<Student> studentsList;

    public Teacher(String name, String username, String id, String email, LocalDate date, float salary, ArrayList<Student> studentsList) {
        super(name, username, id, email, date);
        this.salary = salary;
        this.studentsList = studentsList;
    }

    public Teacher() {
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    //methods
    public void addStudent(Student student) {
        getStudentsList().add(student);
    }

    public void removeStudent(Student student) {
        getStudentsList().remove(student);
    }

}
