/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author himel
 */
public class ArchivoEmployee {

    File file;

    public void createFile() {
        try {
            file = new File("EmployeesList.txt");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "File Created");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeInFile(Employee employee) {
        try {
            FileWriter wr = new FileWriter(file, true);
            wr.write(employee.getId() + "%"
                    + employee.getEmail() + "%"
                    + employee.getUsername() + "%"
                    + employee.getName() + "%"
                    + employee.getDate() + "%"
                    + employee.getSalary() + "%"
                    + employee.getPosition() + "\r\n");
            wr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
