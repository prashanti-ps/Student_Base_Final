/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import UI.Student.StudentDashboard;
import business.EcoSystem;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author prashantii_s
 */
public class StudentRole extends Role{
    @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new StudentDashboard(userProcessContainer, account,business );
     }
}
