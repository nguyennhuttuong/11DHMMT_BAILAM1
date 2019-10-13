/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baihoctuan5;

/**
 *
 * @author admin
 */
public class NhanVien {
    private int ID;
    private String Name;
    private String Address;
    private String Gender;
    private String Knowledge;
    private String Subject;
    public NhanVien(){
        
    }

    /**
     *
     * @param Name
     * @param Address
     * @param Gender
     * @param Knowledge
     * @param Subject
     */
    public NhanVien(String Name, String Address, String Gender, String Knowledge, String Subject ){
      this.Name = Name;
      this.Address = Address;
      this.Gender = Gender;
      this.Knowledge = Knowledge;
      this.Subject = Subject;
      
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getGender() {
        return Gender;
    }

    public String getKnowledge() {
        return Knowledge;
    }

    public String getSubject() {
        return Subject;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setKnowledge(String Knowledge) {
        this.Knowledge = Knowledge;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    
    
    
}
