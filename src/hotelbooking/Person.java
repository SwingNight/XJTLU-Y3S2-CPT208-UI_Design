/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

/**
 *
 * @author lnasw
 */
public class Person {
    String firstName;
    String familyName;
    String idNumber;
    String phone;

    public Person(String firstName, String familyName, String idNumber, String phone) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.idNumber = idNumber;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPhone() {
        return phone;
    }
    
    public boolean isNotEmpty() {
        return !firstName.equals("") && !familyName.equals("") && !idNumber.equals("") && !phone.equals("");
    }
    
}
