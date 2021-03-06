/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.student.accomodation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pratik
 */
public class PermanentDirectory {
    private Map<String,ArrayList<Permanent>> permanentDirectory;
    
    public PermanentDirectory()
    {
        this.permanentDirectory=new HashMap<String,ArrayList<Permanent>>();
    }

    public Map<String, ArrayList<Permanent>> getPermanentDirectory() {
        return permanentDirectory;
    }

    public void setPermanentDirectory(Map<String, ArrayList<Permanent>> permanentDirectory) {
        this.permanentDirectory = permanentDirectory;
    }
    
    public void addNewPermanentAccomodation(String email, Permanent p)
   {
       
       ArrayList<Permanent> perArr = permanentDirectory.get(email);
       
       if(null != perArr)
       {
           perArr.add(p);
       this.permanentDirectory.put(email,perArr);
       }
       else
       {
           ArrayList<Permanent> per =new ArrayList<Permanent>();
           per.add(p);
           this.permanentDirectory.put(email,per);
       }
       
       
   }
    public void deleteObject(Permanent p)
   {
        permanentDirectory.get(p.getContact()).remove(p);

        
   }
}
