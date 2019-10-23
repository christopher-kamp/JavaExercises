/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethod;

/**
 *
 * @author chris
 */
public class StringMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName = "Nick";
        String lastName = "Nickolopoulos";   
        String fullName = giveFullName(firstName, lastName);
        System.out.println(fullName);
    }
    
    public static String giveFullName(String fname, String lname){
        
        String fullName = fname.concat(lname);
        System.out.println(fullName);
        String fullNameUpper = fullName.toUpperCase();
        return fullNameUpper;
    }    
}















