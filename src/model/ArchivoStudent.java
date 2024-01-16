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
 * @author himelmaj
 */
public class ArchivoStudent {

    File file;

    public void createFile() {
        try {
            file = new File("StudentList.txt");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "File Created");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeInFile(Student student) {
        try {
            FileWriter wr = new FileWriter(file, true);
            wr.write(student.getId() + "%" + student.getEmail() + "%" + student.getUsername() + "%" + student.getName()
                    + "%" + student.getAge() + "%" + student.getApprovalStatus()
                    + "%" + student.getMatriculationFee() + "\r\n");
            wr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
