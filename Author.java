/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3w2d4;

/**
 *
 * @author chris
 */
public class Author {
    public String name; 
    public String email;
    public String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{ name= " + name + " email=" + email + ", gender=" + gender + '}';
    }
    
    
}
