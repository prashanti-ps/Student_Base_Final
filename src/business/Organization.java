/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.FAQ.FAQDirectory;
import business.Purchase.PurchaseDirectory;
import business.Rent.RentProductDirectory;
import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;
import business.role.Role;
import business.admin.AdminDirectory;
import business.complaintManagement.ComplaintManagerDirectory;
import business.events.EventDirectory;
import business.student.accomodation.PermanentDirectory;
import business.student.accomodation.TemporaryDirectory;
import business.student.registration.StudentDirectory;

/**
 *
 * @author prashantii_s
 */
public abstract class Organization {

    private String name;
    private AdminDirectory adminDirectory;
    private ComplaintManagerDirectory complaintManagerDirectory;
    private UserAccountDirectory userAccountDirectory;
    private TemporaryDirectory temporaryDirectory;
    private PermanentDirectory permanentDirectory;
    private StudentDirectory studentDirectory;
    private EventDirectory eventDirectory;
    private RentProductDirectory rentProductDirectory;
    private int organizationID;
     private PurchaseDirectory purchaseDirectory;
     private FAQDirectory faqDirectory;
    private static int counter = 0;

    public enum Type {
        Student("Student"),
        ComplaintManager("ComplaintManager"),
        SysAdmin("Sysadmin");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        adminDirectory = new AdminDirectory();
        complaintManagerDirectory = new ComplaintManagerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        temporaryDirectory = new TemporaryDirectory();
        permanentDirectory = new PermanentDirectory();
        studentDirectory = new StudentDirectory();
        purchaseDirectory = new PurchaseDirectory();
        rentProductDirectory = new RentProductDirectory();
        eventDirectory= new EventDirectory();
        faqDirectory = new FAQDirectory();
        organizationID = counter;
        ++counter;
    }

    public FAQDirectory getFaqDirectory() {
        return faqDirectory;
    }

    public void setFaqDirectory(FAQDirectory faqDirectory) {
        this.faqDirectory = faqDirectory;
    }

    public RentProductDirectory getRentProductDirectory() {
        return rentProductDirectory;
    }

    public void setRentProductDirectory(RentProductDirectory rentProductDirectory) {
        this.rentProductDirectory = rentProductDirectory;
    }

    public PurchaseDirectory getPurchaseDirectory() {
        return purchaseDirectory;
    }

    public void setPurchaseDirectory(PurchaseDirectory purchaseDirectory) {
        this.purchaseDirectory = purchaseDirectory;
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(EventDirectory eventDirectory) {
        this.eventDirectory = eventDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public ComplaintManagerDirectory getComplaintManagerDirectory() {
        return complaintManagerDirectory;
    }

    public void setComplaintManagerDirectory(ComplaintManagerDirectory complaintManagerDirectory) {
        this.complaintManagerDirectory = complaintManagerDirectory;
    }

    public TemporaryDirectory getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public void setTemporaryDirectory(TemporaryDirectory temporaryDirectory) {
        this.temporaryDirectory = temporaryDirectory;
    }

    public PermanentDirectory getPermanentDirectory() {
        return permanentDirectory;
    }

    public void setPermanentDirectory(PermanentDirectory permanentDirectory) {
        this.permanentDirectory = permanentDirectory;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public Organization() {

    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }

    public String getName() {
        return name;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
