/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Purchase;

import UI.Student.StudentDashboard;
import UI.Student.studentRegistrationJPanel;
import business.EcoSystem;
import business.Purchase.Purchase;
import business.Purchase.PurchaseDirectory;
import business.student.accomodation.Permanent;
import business.student.registration.Student;
import business.student.registration.StudentDirectory;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mayurimore
 */
public class postSellingProduct extends javax.swing.JPanel {

    /**
     * Creates new form postSellingProduct
     */
    PurchaseDirectory purchaseDirectory;
    JPanel userProcessContainer;
    StudentDirectory studentDirectory;
    UserAccount userAccount;
    EcoSystem ecosystem;
     String getSelectedImage ;
     Purchase p = new Purchase();
    
    public postSellingProduct(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.purchaseDirectory = ecosystem.getPurchaseDirectory();
        this.studentDirectory = ecosystem.getStudentDirectory();
        this.userProcessContainer = userProcessContainer;
        
        
        populateTable();
        clearFields();
        enableFields(false);
        btnPost.setEnabled(false);
        btnUpdate.setEnabled(false);
        
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        txtProductName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtContactEmail = new javax.swing.JTextField();
        btnPost = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblPriceCheck = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();
        comboCondition = new javax.swing.JComboBox<>();
        lblQuantityCheck = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblUploadImage = new javax.swing.JLabel();
        btnUploadImage = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaRequests = new javax.swing.JTextArea();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(29, 31, 40));

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Address", "price", "Quantity", "Condition", "Category", "Comment", "Availibility", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblProductList);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Name :");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price :");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("category :");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity :");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Condition :");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact Email :");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        txtAreaAddress.setColumns(20);
        txtAreaAddress.setRows(5);
        jScrollPane2.setViewportView(txtAreaAddress);

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });

        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });

        txtContactEmail.setEditable(false);

        btnPost.setBackground(new java.awt.Color(251, 129, 34));
        btnPost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPost.setForeground(new java.awt.Color(255, 255, 255));
        btnPost.setText("Post product");
        btnPost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPost.setBorderPainted(false);
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Post Products for sale");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Comment :");

        btnUpdate.setBackground(new java.awt.Color(251, 129, 34));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblPriceCheck.setForeground(new java.awt.Color(204, 204, 204));
        lblPriceCheck.setText("PriceCheck");

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronics", "Furniture", "Home Decor", "Mattresses" }));

        comboCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New", "upto 3 months old", "upto 6 months old", "older than 6 months" }));

        lblQuantityCheck.setForeground(new java.awt.Color(204, 204, 204));
        lblQuantityCheck.setText("Quantity Check");

        Edit.setBackground(new java.awt.Color(251, 129, 34));
        Edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("edit");
        Edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Edit.setBorderPainted(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Upload Image");

        lblUploadImage.setText("upload Image");

        btnUploadImage.setBackground(new java.awt.Color(251, 129, 34));
        btnUploadImage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUploadImage.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadImage.setText("Choose Image");
        btnUploadImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUploadImage.setBorderPainted(false);
        btnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImageActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Status");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Taken" }));

        btnAdd.setBackground(new java.awt.Color(251, 129, 34));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Product");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdd.setBorderPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(251, 129, 34));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buy Requests");

        txtAreaRequests.setColumns(20);
        txtAreaRequests.setRows(5);
        jScrollPane4.setViewportView(txtAreaRequests);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContactEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCondition, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPriceCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQuantityCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 615, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtComment, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                    .addComponent(btnUploadImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4))
                                .addGap(35, 35, 35)
                                .addComponent(lblUploadImage)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPost, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPriceCheck)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtContactEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblQuantityCheck)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lblUploadImage))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        // TODO add your handling code here:
        
         if (validityCheck()){
            // Purchase p = new Purchase();
        Purchase p1 = new Purchase();
        String email = userAccount.getStudent().getEmailAddress();
        p1.setProductImage(p.getProductImage());
        p1.setProductName(txtProductName.getText());
        p1.setCategory(comboCategory.getSelectedItem().toString());
        p1.setQuantity(Integer.parseInt(txtQuantity.getText()));
        p1.setPrice(Integer.parseInt(txtPrice.getText()));
        p1.setComment(txtComment.getText());
        p1.setAddress(txtAreaAddress.getText());
       // p.setContactEmail(email);
        p1.setContact(email);
        p1.setContidion(comboCondition.getSelectedItem().toString());
        p1.setStatus("OK");

        p1.setStatusOfProduct(comboStatus.getSelectedItem().toString());
        p1.setBuyRequests("");
        
        
        
        
        
        
        
        
    
        
        

        
        ecosystem.getPurchaseDirectory().addNewPurchaseProduct(email, p1);
         //purchaseDirectory.addNewPurchaseProduct(email, p);
       // p.setProductImage(productImage);
       JOptionPane.showMessageDialog(this, "Product Posted!");
        clearFields();
        populateTable();
        
        btnPost.setEnabled(false);
        enableFields(false);
         }
         
         else{
             JOptionPane.showMessageDialog(this, "All fields must be filled");
         
         }
        
    }//GEN-LAST:event_btnPostActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblProductList.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update!");
            return;
        } else if (validityCheck()) {
            //fieldsEnableDisable(true);
            DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
            Purchase p = (Purchase) model.getValueAt(selectedRowIndex, 0);
            Map<String, ArrayList<Purchase>> latestDirectory = purchaseDirectory.getPurchaseDirectory();
            ArrayList<Purchase> perArr = latestDirectory.get(p.getContact());
            for (Purchase obj : perArr) {
                if (obj.equals(p)) {
                    obj.setProductName(txtProductName.getText());
                    obj.setPrice(Integer.parseInt(txtPrice.getText()));
                    obj.setAddress(txtAreaAddress.getText());
                    //obj.setQuantity(Integer.parseInt(txtQuantity.getText()));
                    obj.setContidion(comboCondition.getSelectedItem().toString());
                    obj.setComment(txtComment.getText());
                    
                    obj.setCategory(comboCategory.getSelectedItem().toString());
                    obj.setStatusOfProduct(comboStatus.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(this, "Record Updated!");
                   // enableFields(false);
                    lblPriceCheck.setEnabled(false);
                    lblQuantityCheck.setEnabled(false);
                    
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "All fields must be filled and valid!");
        }
        btnUpdate.setEnabled(false);
        clearFields();
        populateTable();
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
        
        String enteredText = txtPrice.getText();
        if (enteredText.matches("^[0-9]+$")) {
            lblPriceCheck.setVisible(true);
            lblPriceCheck.setForeground(Color.WHITE);
            lblPriceCheck.setText("Valid Entry");
        } else {
            lblPriceCheck.setVisible(true);
            lblPriceCheck.setForeground(Color.orange);
            lblPriceCheck.setText("Enter numbers only");
        }
    }//GEN-LAST:event_txtPriceKeyReleased

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        // TODO add your handling code here:
        String enteredText = txtPrice.getText();
        if (enteredText.matches("^[0-9]+$")) {
            lblQuantityCheck.setVisible(true);
            lblQuantityCheck.setForeground(Color.WHITE);
            lblQuantityCheck.setText("Valid Entry");
        } else {
            lblQuantityCheck.setVisible(true);
            lblQuantityCheck.setForeground(Color.orange);
            lblQuantityCheck.setText("Enter numbers only");
        }
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblProductList.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit!");
            return;
        } else {
            enableFields(true);
            btnUpdate.setEnabled(true);
            btnPost.setEnabled(false);
            DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
            Purchase p = (Purchase) model.getValueAt(selectedRowIndex, 0);
            txtProductName.setText(p.getProductName());
            txtContactEmail.setText(userAccount.getStudent().getEmailAddress());
            txtPrice.setText(String.valueOf(p.getPrice()));
            txtAreaAddress.setText(p.getAddress());
            txtQuantity.setText(String.valueOf(p.getQuantity()));
            txtComment.setText(p.getComment());
            
            comboCategory.setSelectedItem(p.getCategory().toString());
            comboCondition.setSelectedItem(p.getContidion().toString());
            comboStatus.setSelectedItem(p.getStatusOfProduct().toString());
            txtAreaRequests.setText(p.getBuyRequests());
            
             ImageIcon imIcon = new ImageIcon(p.getProductImage());
    Image image = imIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
ImageIcon imICon2 = new ImageIcon(newimg);
    lblUploadImage.setIcon(imICon2);
        }
    }//GEN-LAST:event_EditActionPerformed

    private void btnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImageActionPerformed
        // TODO add your handling code here:
        
        JFileChooser filechooser = new JFileChooser();
    filechooser.setDialogTitle("Choose Your File");
    FileNameExtensionFilter filter = new FileNameExtensionFilter("4 extentions supported", "jpg", "png", "jpeg", "gif");
    int selected =  filechooser.showOpenDialog(this);
    if(selected==JFileChooser.APPROVE_OPTION){
    File file = filechooser.getSelectedFile();
      getSelectedImage = file.getAbsolutePath();
    JOptionPane.showConfirmDialog(null, getSelectedImage);
    ImageIcon imIcon = new ImageIcon(getSelectedImage);
    Image image = imIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
ImageIcon imICon2 = new ImageIcon(newimg);
    lblUploadImage.setIcon(imICon2);
    
    p.setProductImage(getSelectedImage);
    
    
    //Purchase p = new Purchase();
    //p.setProductImage(getSelectedImage);
    //System.out.print("path in sell is " + p.getProductImage());
    
   /* Purchase p = new Purchase();
    
    //upload file in folder
    
    String newPath = "/Users/mayurimore/NetBeansProjects/Final_Project/Images/";
    
             
    File directory = new File(newPath);
    if(!directory.exists()){
    directory.mkdirs();
    }
    
    File sourceFile = null;
    File destinationFile = null;
    String extension = getSelectedImage.substring(getSelectedImage.lastIndexOf('.' + 1));
    sourceFile = new File(getSelectedImage);
    destinationFile = new File(newPath  + extension);
    
            try {
                Files.copy(sourceFile.toPath(), destinationFile.toPath());
            } catch (IOException ex) {
                Logger.getLogger(postSellingProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
          //  System.out.println(sourceFile.toPath());
          //  System.out.println(destinationFile.toPath());
            
            
    
    */
    }
    }//GEN-LAST:event_btnUploadImageActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        clearFields();
        enableFields(true);
        btnUpdate.setEnabled(false);
        btnPost.setEnabled(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        StudentDashboard studentDashboardPanel = new StudentDashboard(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("studentDashboardPanel", studentDashboardPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPost;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboCondition;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblPriceCheck;
    private javax.swing.JLabel lblQuantityCheck;
    private javax.swing.JLabel lblUploadImage;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextArea txtAreaAddress;
    private javax.swing.JTextArea txtAreaRequests;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtContactEmail;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtContactEmail.setText(userAccount.getStudent().getEmailAddress());
        txtAreaAddress.setText("");
        
        txtComment.setText("");
        
       // txtContactEmail.setText("");
        txtPrice.setText("");
        txtProductName.setText("");
        txtQuantity.setText("");
        lblUploadImage.setIcon(null) ;
        txtAreaRequests.setText("");
      
    }

    private void populateTable() {
        //To change body of generated methods, choose Tools |    Templates .
        //sync
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        model.setRowCount(0);
        Map<String, ArrayList<Purchase>> directory = purchaseDirectory.getPurchaseDirectory();
        ArrayList<Purchase> foundDirectory = new ArrayList<Purchase>();
        try {
            //System.out.print(userAccount.getStudent().getEmailAddress());
            foundDirectory = directory.get(userAccount.getStudent().getEmailAddress());
            for (Purchase p : foundDirectory) {
                Object[] row = new Object[9];

                row[0] = p;
                row[1] = p.getAddress();
                row[2] = p.getPrice();
                row[3] = p.getQuantity();
                row[4] = p.getContidion();
                row[5] = p.getCategory();
                row[6] = p.getComment();
                row[7] = p.getStatusOfProduct();
                row[8] = p.getStatus();
                model.addRow(row);
        }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
        
        
        

    }
    
    private boolean validityCheck() {

        if (lblPriceCheck.getForeground() == Color.WHITE && lblQuantityCheck.getForeground() == Color.WHITE && lblUploadImage.getIcon() != null ) {
            return true;
        } else {
            return false;
        }
    }
    
    private void enableFields(boolean b) {
        txtProductName.setEnabled(b);
        txtPrice.setEnabled(b);
        txtContactEmail.setEnabled(b);
        txtAreaAddress.setEnabled(b);
        
        txtComment.setEnabled(b);
        txtQuantity.setEnabled(b);
        comboCondition.setEnabled(b);
        comboCategory.setEnabled(b);
        btnUploadImage.setEnabled(b);

    }
    
}
