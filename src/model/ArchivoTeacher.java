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
public class ArchivoTeacher {
    File file;

    public void createFile() {
        try {
            file = new File("TeachersList.txt");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "File Created");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeInFile(Teacher teacher) {
        try {
            FileWriter wr = new FileWriter(file, true);
            wr.write(teacher.getId() + "%"
                    + teacher.getEmail() + "%"
                    + teacher.getUsername() + "%"
                    + teacher.getName() + "%"
                    + teacher.getDate() + "%"
                    + teacher.getSalary() + "%");
            wr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
