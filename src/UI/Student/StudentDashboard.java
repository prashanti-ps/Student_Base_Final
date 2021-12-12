/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Student;

import UI.Accomodation.findPermanentAccomodation;
import UI.Accomodation.findTemporaryAccomodationJPanel;
import UI.Accomodation.postPermanentAccomodation;
import UI.Accomodation.postTemporaryAccomodationJPanel;
import UI.Events.FindEventsJPanel;
import UI.Events.HostEventsJPanel;
import UI.Purchase.FindPurchaseProducts;
import UI.Purchase.postSellingProduct;
import business.EcoSystem;
import javax.swing.JSplitPane;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.TemporaryDirectory;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author prashantii_s
 */
public class StudentDashboard extends javax.swing.JPanel {

    /**
     * Creates new form StudentDashboard
     */
    PermanentDirectory permanentDirectory;
    TemporaryDirectory temporaryDirectory;
    
   JSplitPane jSplitPane1;
    EcoSystem ecosystem;
    UserAccount userAccount;
    JPanel userProcessContainer;
    public StudentDashboard(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
        this.userProcessContainer=userProcessContainer;
        this.permanentDirectory=ecosystem.getPermanentDirectory();
        this.temporaryDirectory=ecosystem.getTemporaryDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFindTemp = new javax.swing.JButton();
        btnPostTemp = new javax.swing.JButton();
        btnFindPermanent = new javax.swing.JButton();
        btnPostPermanent = new javax.swing.JButton();
        btnSellItems = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnHost = new javax.swing.JButton();
        btnFindEvent = new javax.swing.JButton();
        btnBuyItems = new javax.swing.JButton();

        setBackground(new java.awt.Color(29, 34, 40));

        btnFindTemp.setBackground(new java.awt.Color(251, 129, 34));
        btnFindTemp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFindTemp.setForeground(new java.awt.Color(255, 255, 255));
        btnFindTemp.setText("Find Temporary Accomodation");
        btnFindTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFindTemp.setBorderPainted(false);
        btnFindTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindTempActionPerformed(evt);
            }
        });

        btnPostTemp.setBackground(new java.awt.Color(251, 129, 34));
        btnPostTemp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPostTemp.setForeground(new java.awt.Color(255, 255, 255));
        btnPostTemp.setText("Post a Temporary Accomodation");
        btnPostTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPostTemp.setBorderPainted(false);
        btnPostTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostTempActionPerformed(evt);
            }
        });

        btnFindPermanent.setBackground(new java.awt.Color(251, 129, 34));
        btnFindPermanent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFindPermanent.setForeground(new java.awt.Color(255, 255, 255));
        btnFindPermanent.setText("Find Permanent Accomodation");
        btnFindPermanent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFindPermanent.setBorderPainted(false);
        btnFindPermanent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPermanentActionPerformed(evt);
            }
        });

        btnPostPermanent.setBackground(new java.awt.Color(251, 129, 34));
        btnPostPermanent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPostPermanent.setForeground(new java.awt.Color(255, 255, 255));
        btnPostPermanent.setText("Post a Permanent Accomodation");
        btnPostPermanent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPostPermanent.setBorderPainted(false);
        btnPostPermanent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostPermanentActionPerformed(evt);
            }
        });

        btnSellItems.setBackground(new java.awt.Color(251, 129, 34));
        btnSellItems.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSellItems.setForeground(new java.awt.Color(255, 255, 255));
        btnSellItems.setText("Post Products for Sale");
        btnSellItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSellItems.setBorderPainted(false);
        btnSellItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellItemsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Dasboard");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Temorary Accomodation:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Permanent Accomodation:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buying / Selling");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Events");

        btnHost.setBackground(new java.awt.Color(251, 129, 34));
        btnHost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHost.setForeground(new java.awt.Color(255, 255, 255));
        btnHost.setText("Host");
        btnHost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnHost.setBorderPainted(false);
        btnHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHostActionPerformed(evt);
            }
        });

        btnFindEvent.setBackground(new java.awt.Color(251, 129, 34));
        btnFindEvent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFindEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnFindEvent.setText("Find");
        btnFindEvent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFindEvent.setBorderPainted(false);
        btnFindEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindEventActionPerformed(evt);
            }
        });

        btnBuyItems.setBackground(new java.awt.Color(251, 129, 34));
        btnBuyItems.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuyItems.setForeground(new java.awt.Color(255, 255, 255));
        btnBuyItems.setText("Buy Products");
        btnBuyItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuyItems.setBorderPainted(false);
        btnBuyItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBuyItems, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSellItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFindTemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPostTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFindPermanent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPostPermanent, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHost, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnFindEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuyItems, btnFindPermanent, btnFindTemp, btnPostTemp});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindTemp)
                    .addComponent(btnFindPermanent))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPostTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPostPermanent))
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSellItems, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuyItems, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHost)
                    .addComponent(btnFindEvent))
                .addContainerGap(624, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFindEvent, btnHost, btnSellItems});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuyItems, btnFindPermanent, btnFindTemp, btnPostPermanent, btnPostTemp});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSellItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellItemsActionPerformed
        // TODO add your handling code here:
        
        postSellingProduct postPermanentAccomodationPanel=new postSellingProduct( userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("postPermanentAccomodationPanel", postPermanentAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnSellItemsActionPerformed

    private void btnFindTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindTempActionPerformed
        findTemporaryAccomodationJPanel FindTemporaryAccomodationPanel=new findTemporaryAccomodationJPanel( userProcessContainer,  userAccount,  ecosystem);
        userProcessContainer.add("FindTemporaryAccomodationPanel", FindTemporaryAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnFindTempActionPerformed

    private void btnPostTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostTempActionPerformed
        postTemporaryAccomodationJPanel postTemporaryAccomodationPanel=new postTemporaryAccomodationJPanel( userProcessContainer,  userAccount,  ecosystem);
        userProcessContainer.add("postTemporaryAccomodationPanel", postTemporaryAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnPostTempActionPerformed

    private void btnFindPermanentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPermanentActionPerformed
       findPermanentAccomodation findPermanentAccomodationPanel=new findPermanentAccomodation( userProcessContainer,  userAccount,  ecosystem);
        userProcessContainer.add("findPermanentAccomodationPanel", findPermanentAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnFindPermanentActionPerformed

    private void btnPostPermanentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostPermanentActionPerformed
       postPermanentAccomodation postPermanentAccomodationPanel=new postPermanentAccomodation( userProcessContainer,  userAccount,  ecosystem);
        userProcessContainer.add("postPermanentAccomodationPanel", postPermanentAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnPostPermanentActionPerformed

    private void btnHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHostActionPerformed
        // TODO add your handling code here:
                HostEventsJPanel hostEventsJPanel=new HostEventsJPanel( userProcessContainer,  userAccount,  ecosystem);
        userProcessContainer.add("hostEventsJPanel", hostEventsJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHostActionPerformed

    private void btnFindEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindEventActionPerformed
        // TODO add your handling code here:
        FindEventsJPanel findEventsJPanel=new FindEventsJPanel( userProcessContainer,  userAccount,  ecosystem);
        userProcessContainer.add("findEventsJPanel", findEventsJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindEventActionPerformed

    private void btnBuyItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyItemsActionPerformed
        // TODO add your handling code here:
        FindPurchaseProducts postPermanentAccomodationPanel=new FindPurchaseProducts( userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("postPermanentAccomodationPanel", postPermanentAccomodationPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnBuyItemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyItems;
    private javax.swing.JButton btnFindEvent;
    private javax.swing.JButton btnFindPermanent;
    private javax.swing.JButton btnFindTemp;
    private javax.swing.JButton btnHost;
    private javax.swing.JButton btnPostPermanent;
    private javax.swing.JButton btnPostTemp;
    private javax.swing.JButton btnSellItems;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
