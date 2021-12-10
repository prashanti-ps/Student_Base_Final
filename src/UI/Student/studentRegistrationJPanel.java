/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Student;

import UI.HomeJPanel;
import business.EcoSystem;
import business.role.StudentRole;
import business.student.registration.Student;
import business.student.registration.StudentDirectory;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mayurimore
 */
public class studentRegistrationJPanel extends javax.swing.JPanel {

    StudentDirectory studentDirectory;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    int otp;
    boolean isemailVerified=false;

    /**
     * Creates new form studentRegistrationJPanel
     */
    public studentRegistrationJPanel(JPanel ContainerPanel, UserAccount account, EcoSystem ecosystem) {
        initComponents();

        this.userProcessContainer = ContainerPanel;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.studentDirectory = ecosystem.getStudentDirectory();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnVerifyEmail = new javax.swing.JButton();
        txtOTP = new javax.swing.JTextField();
        btnCheckOTP = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jLabel1.setText("First Name :");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Student Registration");

        jLabel2.setText("Last Name :");

        jLabel3.setText("Email Address :");

        jLabel4.setText("Password :");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnVerifyEmail.setText("Verify Email");
        btnVerifyEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyEmailActionPerformed(evt);
            }
        });

        txtOTP.setEnabled(false);

        btnCheckOTP.setText("Submit OTP");
        btnCheckOTP.setEnabled(false);
        btnCheckOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOTPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registrationPanelLayout = new javax.swing.GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel4)
                .addGap(130, 130, 130)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationPanelLayout.createSequentialGroup()
                        .addGap(0, 227, Short.MAX_VALUE)
                        .addComponent(btnVerifyEmail)
                        .addGap(351, 351, 351))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOTP)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckOTP)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registrationPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registrationPanelLayout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGap(97, 97, 97)
                            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addComponent(txtLastName)
                                .addComponent(txtEmailAddress))
                            .addGap(187, 187, 187))
                        .addGroup(registrationPanelLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap()))))
            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registrationPanelLayout.createSequentialGroup()
                    .addGap(294, 294, 294)
                    .addComponent(btnRegister)
                    .addGap(18, 18, 18)
                    .addComponent(btnBack)
                    .addContainerGap(518, Short.MAX_VALUE)))
        );
        registrationPanelLayout.setVerticalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnVerifyEmail)
                .addGap(33, 33, 33)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckOTP))
                .addGap(36, 36, 36)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(649, Short.MAX_VALUE))
            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registrationPanelLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jLabel6)
                    .addGap(42, 42, 42)
                    .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(38, 38, 38)
                    .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(38, 38, 38)
                    .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addContainerGap(773, Short.MAX_VALUE)))
            .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registrationPanelLayout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegister)
                        .addComponent(btnBack))
                    .addContainerGap(581, Short.MAX_VALUE)))
        );

        add(registrationPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        boolean isExists=false;
        if (txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtEmailAddress.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all fields");
            return;
        }
        isExists = ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtEmailAddress.getText().trim());
        if(isemailVerified && !isExists){
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String emailAddress = txtEmailAddress.getText();
        String Password = txtPassword.getText();
        Student sd = new Student(firstName,lastName,Password,emailAddress);

        ecosystem.getStudentDirectory().addNewStudent(sd);
        ecosystem.getUserAccountDirectory().createUserAccount(emailAddress, Password, null, null,sd, new StudentRole());
        //ecosystem.getUserAccountDirectory().addUserAccount(sd);

        JOptionPane.showMessageDialog(this, "Student registered. ");

        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmailAddress.setText("");
        txtPassword.setText("");

        }
        else{
            if(!isemailVerified)
             JOptionPane.showMessageDialog(this, "Verify your email adress first!");
            if(isExists)
              JOptionPane.showMessageDialog(this, "This Email address is already registered with us!");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
       HomeJPanel HomeJPanel1 = new HomeJPanel();
        userProcessContainer.add(HomeJPanel1);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);



    }//GEN-LAST:event_btnBackActionPerformed
                           

    private void btnVerifyEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyEmailActionPerformed
        boolean isEmailCorrect=false;
        if(null != txtEmailAddress.getText() && txtEmailAddress.getText() !=""){
              String pattern = "^([A-Za-z0-9_.]+)@([a-z]+)(\\.)([a-z]+).?([a-z]{2,3})?$";
              Pattern pat = Pattern.compile(pattern);
                Matcher mat = pat.matcher(txtEmailAddress.getText().trim());
        if (!mat.matches()){
             JOptionPane.showMessageDialog(this, "Enter Valid University Email Address");
             return;
        }else if(!txtEmailAddress.getText().trim().endsWith("@northeastern.edu")){
             JOptionPane.showMessageDialog(this, "Enter Valid University Email Address");
            return;
        }else{
            isEmailCorrect=true;
        }
        }else{
             JOptionPane.showMessageDialog(this, "Enter Email Address First");
             return;

        }
        if(isEmailCorrect){ 
        Random rand = new Random();
        otp = rand.nextInt(999999);
        String toEmail = txtEmailAddress.getText().trim();
        String fromEmail = "randadpratik789@gmail.com";
        String pass = "pratik@3848";
        String subject = "Verify Your OTP- AED Final Project Test";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "25");
        props.put("mail.debug", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.EnableSSL.enable", "true");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, pass);
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText("Hello " + txtFirstName.getText() + "\n"+ " Your OTP is : " + String.valueOf(otp));
            Transport.send(message);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
             JOptionPane.showMessageDialog(this, "Enter the OTP sent on your Email address");
             
             btnCheckOTP.setEnabled(true);
             txtOTP.setEnabled(true);
        }
        }
    }//GEN-LAST:event_btnVerifyEmailActionPerformed

    private void btnCheckOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOTPActionPerformed
       if(null != txtOTP.getText() && txtOTP.getText() !=""){                                            
        String userInput = txtOTP.getText();
        if (Integer.parseInt(userInput) == otp) {
            JOptionPane.showMessageDialog(this, "Verified succesfully");
            isemailVerified=true;
            btnCheckOTP.setEnabled(false);
            txtOTP.setText(null);
            txtOTP.setEnabled(false);
        } else
            JOptionPane.showMessageDialog(this, "Incorrect OTP");   
       }else{
           JOptionPane.showMessageDialog(this, "Enter OTP First");
             return;
    }
    }//GEN-LAST:event_btnCheckOTPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOTP;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnVerifyEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel registrationPanel;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
