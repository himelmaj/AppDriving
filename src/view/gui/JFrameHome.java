/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.gui;

import control.DataClass;

/**
 *
 * @author sergirodesc
 */
public class JFrameHome extends javax.swing.JFrame {

    public class Constants {

        public static final int FRAME_WIDTH = 800;
        public static final int FRAME_HEIGHT = 600;
    }

    /**
     * Creates new form JFrameHome
     */
    public JFrameHome() {
        initComponents();
        setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);

        initConfig();
    }

    private void initConfig() {
        DataClass.JFHome = this;
        DataClass.setVisibility();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHome = new javax.swing.JPanel();
        jButtonEmployees = new javax.swing.JButton();
        jButtonStudents = new javax.swing.JButton();
        jButtonTeachers = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jButtonEmployees.setText("Employees");
        jButtonEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmployeesActionPerformed(evt);
            }
        });

        jButtonStudents.setText("Students");
        jButtonStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentsActionPerformed(evt);
            }
        });

        jButtonTeachers.setText("Teachers");
        jButtonTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeachersActionPerformed(evt);
            }
        });

        jButtonHome.setText("Home");
        jButtonHome.setToolTipText("");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButtonEmployees)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButtonStudents)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jButtonTeachers)
                        .addGap(39, 39, 39))))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEmployees)
                    .addComponent(jButtonHome)
                    .addComponent(jButtonTeachers)
                    .addComponent(jButtonStudents))
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeachersActionPerformed
        // TODO add your handling code here:
        DataClass.gotoAnotherFrame(this, DataClass.JFTeachers);

    }//GEN-LAST:event_jButtonTeachersActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        if (DataClass.JFHome != this) {
            DataClass.gotoAnotherFrame(this, DataClass.JFHome);
        }

    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmployeesActionPerformed

        // TODO add your handling code here:
        DataClass.gotoAnotherFrame(this, DataClass.JFEmployees);

    }//GEN-LAST:event_jButtonEmployeesActionPerformed

    private void jButtonStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStudentsActionPerformed
        // TODO add your handling code here:
//        this.setVisible(false);
        DataClass.gotoAnotherFrame(this, DataClass.JFStudents);
    }//GEN-LAST:event_jButtonStudentsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHome().setVisible(true);          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmployees;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonStudents;
    private javax.swing.JButton jButtonTeachers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelHome;
    // End of variables declaration//GEN-END:variables
}
