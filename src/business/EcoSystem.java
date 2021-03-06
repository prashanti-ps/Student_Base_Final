/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.FAQ.FAQDirectory;
import business.Purchase.PurchaseDirectory;
import business.Rent.RentProductDirectory;
import business.events.EventDirectory;
import business.role.AdminRole;
import business.role.Role;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.TemporaryDirectory;
import business.student.registration.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author prashantii_s
 */
public class EcoSystem extends Organization{
    
    
    private static EcoSystem business;
    private TemporaryDirectory temporaryDirectory;
    private PermanentDirectory permanentDirectory;
    private StudentDirectory studentDirectory;
    private EventDirectory eventDirectory;
    private PurchaseDirectory purchaseDirectory;
    private RentProductDirectory rentProductDirectory;
    private FAQDirectory faqDirectory;


    public EcoSystem( TemporaryDirectory temporaryDirectory, PermanentDirectory permanentDirectory, StudentDirectory studentDirectory, PurchaseDirectory purchaseDirectory, RentProductDirectory rentProductDirectory, EventDirectory eventDirectory, FAQDirectory faqDirectory)
    {

        this.temporaryDirectory = temporaryDirectory;
        this.permanentDirectory = permanentDirectory;
        this.studentDirectory=studentDirectory;
        this.eventDirectory=eventDirectory;
        this.purchaseDirectory = purchaseDirectory;
        this.rentProductDirectory = rentProductDirectory;
        this.faqDirectory = faqDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
    }
   private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    
}
