/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JFrame;
import view.gui.JFrameEmployees;
import view.gui.JFrameHome;
import view.gui.JFrameStudents;
import view.gui.JFrameTeachers;

/**
 *
 * @author sergirodesc
 */
public class DataClass {

    public static JFrameHome JFHome;
    public static JFrameStudents JFStudents = new JFrameStudents();
    public static JFrameTeachers JFTeachers = new JFrameTeachers();
    public static JFrameEmployees JFEmployees = new JFrameEmployees();

    public static void setVisibility() {
        JFStudents.setVisible(false);
        JFTeachers.setVisible(false);
        JFEmployees.setVisible(false);
    }

    public static void gotoAnotherFrame(JFrame JFO, JFrame JFD) {
        JFO.setVisible(false);
        JFD.setVisible(true);
    }
}