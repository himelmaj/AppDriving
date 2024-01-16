/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author himelmaj
 */
public class Employee extends Person {

    private float salary;
    private String position;

    public Employee(String name, String username, String id, String email, LocalDate date, float salary, String position) {
        super(name, username, id, email, date);
        this.salary = salary;
        this.position = position;
    }

    public Employee() {
    }

    public float getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{"
                + super.toString()
                + "salary=" + salary
                + ", position='" + position + '\''
                + '}';
    }
}
