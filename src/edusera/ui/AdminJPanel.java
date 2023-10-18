/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edusera.ui;

import edusera.models.Person;
import edusera.models.ProfessorDirectory;
import edusera.models.Role;
import edusera.models.StudentDirectory;
import edusera.models.User;
import edusera.models.UserDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ingale.r
 */
public class AdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
   private UserDirectory userDir;
    private StudentDirectory studentDir;
    private ProfessorDirectory profDir;
    JPanel mainWorkArea;
    public AdminJPanel(JPanel workArea, UserDirectory userDir,StudentDirectory studentDir, ProfessorDirectory profDir ) {
        initComponents();
        this.userDir = userDir;
        this.studentDir = studentDir;
        initialSetup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProfilePic = new javax.swing.JLabel();
        lblGreetings = new javax.swing.JLabel();
        lblOption1 = new javax.swing.JLabel();
        lblOption2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblProfilePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusera/assets/edusera-user-stock-profile-pic.png"))); // NOI18N
        lblProfilePic.setPreferredSize(new java.awt.Dimension(255, 255));

        lblGreetings.setFont(new java.awt.Font("STHeiti", 1, 24)); // NOI18N
        lblGreetings.setText("Hello !");

        lblOption1.setBackground(new java.awt.Color(255, 255, 255));
        lblOption1.setFont(new java.awt.Font("STHeiti", 1, 24)); // NOI18N
        lblOption1.setForeground(new java.awt.Color(105, 155, 247));
        lblOption1.setText("jLabel1");

        lblOption2.setBackground(new java.awt.Color(255, 255, 255));
        lblOption2.setFont(new java.awt.Font("STHeiti", 1, 24)); // NOI18N
        lblOption2.setForeground(new java.awt.Color(105, 155, 247));
        lblOption2.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGreetings)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3830, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOption1)
                            .addComponent(lblOption2))
                        .addGap(858, 858, 858))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(lblProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(lblOption1)
                        .addGap(18, 18, 18)
                        .addComponent(lblOption2)))
                .addGap(42, 42, 42)
                .addComponent(lblGreetings)
                .addContainerGap(857, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGreetings;
    private javax.swing.JLabel lblOption1;
    private javax.swing.JLabel lblOption2;
    private javax.swing.JLabel lblProfilePic;
    // End of variables declaration//GEN-END:variables

    private void initialSetup() {
        // Adjust icon resolution
        
        
        ImageIcon ii = new ImageIcon("/Users/ingale.r/NetBeansProjects/edusera/src/edusera/assets/edusera-user-stock-profile-pic.png");
        Image image = ii.getImage().getScaledInstance(225, 225, Image.SCALE_SMOOTH);
        lblProfilePic.setIcon(new ImageIcon(image));
        
        // Display greetings
        lblGreetings.setText("Hello ADMIN!");
        
        // Display Options
        lblOption1.setText("Manage Persons >");
        lblOption2.setText("Manage Users >");

    }    
}
