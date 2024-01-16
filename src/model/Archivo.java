/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author himelmaj
 */
import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {

    File file;

    public void createFile() {
        try {
            file = new File("PersonList.txt");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "File Created");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeInFile(Person person) {
        try {
            FileWriter wr = new FileWriter(file, true);
            wr.write(person.getId() + "%" + person.getEmail() + "%" + person.getUsername() + "%" + person.getName() + "\r\n");
            wr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
