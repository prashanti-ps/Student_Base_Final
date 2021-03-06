/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import UI.Accomodation.postTemporaryAccomodationJPanel;
import business.EcoSystem;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.TemporaryDirectory;
import business.student.registration.StudentDirectory;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Pratik
 */
public class adminDashboard extends javax.swing.JPanel {

    /**
     * Creates new form adminDashboard
     */
    PermanentDirectory permanentDirectory;
    TemporaryDirectory temporaryDirectory;
    JPanel userProcessContainer;
    JSplitPane jSplitPane1;
    EcoSystem ecosystem;
    UserAccount userAccount;
    StudentDirectory studentHistory;
    public adminDashboard(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.ecosystem=business;
        this.userAccount=account;
         this.userProcessContainer=userProcessContainer;
        //this.jSplitPane1= jSplitPane1;
        this.permanentDirectory=business.getPermanentDirectory();
        this.temporaryDirectory=business.getTemporaryDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageTemporaryAccomodation = new javax.swing.JButton();
        btnManagePermanentAccomodation = new javax.swing.JButton();
        btnManagePermanentAccomodation1 = new javax.swing.JButton();
        btnManageFAQ = new javax.swing.JButton();
        btnManageRenting = new javax.swing.JButton();
        btnStudentRegistration = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageBuyingSelling = new javax.swing.JButton();

        setBackground(new java.awt.Color(29, 34, 40));

        btnManageTemporaryAccomodation.setBackground(new java.awt.Color(251, 129, 34));
        btnManageTemporaryAccomodation.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManageTemporaryAccomodation.setForeground(new java.awt.Color(255, 255, 255));
        btnManageTemporaryAccomodation.setText(" Temporary Accomodation Management");
        btnManageTemporaryAccomodation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageTemporaryAccomodation.setBorderPainted(false);
        btnManageTemporaryAccomodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTemporaryAccomodationActionPerformed(evt);
            }
        });

        btnManagePermanentAccomodation.setBackground(new java.awt.Color(251, 129, 34));
        btnManagePermanentAccomodation.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManagePermanentAccomodation.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePermanentAccomodation.setText(" Permanent Accomodation Management");
        btnManagePermanentAccomodation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManagePermanentAccomodation.setBorderPainted(false);
        btnManagePermanentAccomodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePermanentAccomodationActionPerformed(evt);
            }
        });

        btnManagePermanentAccomodation1.setBackground(new java.awt.Color(251, 129, 34));
        btnManagePermanentAccomodation1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManagePermanentAccomodation1.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePermanentAccomodation1.setText(" Complaint  Management");
        btnManagePermanentAccomodation1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManagePermanentAccomodation1.setBorderPainted(false);
        btnManagePermanentAccomodation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePermanentAccomodation1ActionPerformed(evt);
            }
        });

        btnManageFAQ.setBackground(new java.awt.Color(251, 129, 34));
        btnManageFAQ.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManageFAQ.setForeground(new java.awt.Color(255, 255, 255));
        btnManageFAQ.setText("Manage FAQ");
        btnManageFAQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageFAQ.setBorderPainted(false);
        btnManageFAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFAQActionPerformed(evt);
            }
        });

        btnManageRenting.setBackground(new java.awt.Color(251, 129, 34));
        btnManageRenting.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManageRenting.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRenting.setText("Manage Renting of Products");
        btnManageRenting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageRenting.setBorderPainted(false);
        btnManageRenting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRentingActionPerformed(evt);
            }
        });

        btnStudentRegistration.setBackground(new java.awt.Color(251, 129, 34));
        btnStudentRegistration.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnStudentRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentRegistration.setText(" Students Management");
        btnStudentRegistration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnStudentRegistration.setBorderPainted(false);
        btnStudentRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentRegistrationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Dashboard");

        btnManageBuyingSelling.setBackground(new java.awt.Color(251, 129, 34));
        btnManageBuyingSelling.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManageBuyingSelling.setForeground(new java.awt.Color(255, 255, 255));
        btnManageBuyingSelling.setText("Manage buying and selling");
        btnManageBuyingSelling.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageBuyingSelling.setBorderPainted(false);
        btnManageBuyingSelling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBuyingSellingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnManagePermanentAccomodation1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManagePermanentAccomodation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnManageTemporaryAccomodation)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageRenting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnManageBuyingSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnManageFAQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStudentRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(btnManageTemporaryAccomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnManagePermanentAccomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnManagePermanentAccomodation1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnManageBuyingSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnManageRenting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnManageFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnStudentRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(545, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTemporaryAccomodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTemporaryAccomodationActionPerformed

        manageTemporaryAccomodation manageTemporaryAccomodationPanel=new manageTemporaryAccomodation( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("manageTemporaryAccomodationPanel", manageTemporaryAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
      
    }//GEN-LAST:event_btnManageTemporaryAccomodationActionPerformed

    private void btnManagePermanentAccomodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePermanentAccomodationActionPerformed
        managePermanentAccomodation managePermanentAccomodationPanel=new managePermanentAccomodation( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("managePermanentAccomodationPanel", managePermanentAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePermanentAccomodationActionPerformed

    private void btnManagePermanentAccomodation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePermanentAccomodation1ActionPerformed
        manageComplaintManagement managecomplaintManagement=new manageComplaintManagement( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("managecomplaintManagement", managecomplaintManagement);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePermanentAccomodation1ActionPerformed

    private void btnManageFAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFAQActionPerformed
        // TODO add your handling code here:
        manageFAQs ManageFAQ=new manageFAQs( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("ManageFAQ", ManageFAQ);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageFAQActionPerformed

    private void btnManageRentingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRentingActionPerformed
        // TODO add your handling code here:
        manageRenting ManageRenting=new manageRenting( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("ManageRenting", ManageRenting);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRentingActionPerformed

    private void btnStudentRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentRegistrationActionPerformed
        manageStudentRegistration ManageStudentRegistration=new manageStudentRegistration( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("ManageStudentRegistration", ManageStudentRegistration);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnStudentRegistrationActionPerformed

    private void btnManageBuyingSellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBuyingSellingActionPerformed
        // TODO add your handling code here:
        manageBuyingSelling ManageBuyingSelling=new manageBuyingSelling( userProcessContainer,  userAccount,  ecosystem);
         userProcessContainer.add("ManageBuyingSelling", ManageBuyingSelling);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageBuyingSellingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageBuyingSelling;
    private javax.swing.JButton btnManageFAQ;
    private javax.swing.JButton btnManagePermanentAccomodation;
    private javax.swing.JButton btnManagePermanentAccomodation1;
    private javax.swing.JButton btnManageRenting;
    private javax.swing.JButton btnManageTemporaryAccomodation;
    private javax.swing.JButton btnStudentRegistration;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
