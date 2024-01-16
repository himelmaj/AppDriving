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
public class Person {

    private String name;
    private String username;
    private String id;
    private String email;
    private LocalDate date;

    public Person(java.lang.String name, java.lang.String username, java.lang.String id, java.lang.String email, LocalDate date) {
        this.name = name;
        this.username = username;
        this.id = id;
        this.email = email;
        this.date = date;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", username='" + username + '\''
                + ", id='" + id + '\''
                + ", email='" + email + '\''
                + ", date=" + date
                + '}';
    }
}
