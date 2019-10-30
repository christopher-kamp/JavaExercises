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
public class Exercise3W2D4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Author author = new Author("RR Martin", "fdafafjkl@fdsf.gr", "Male" );
       Book book = new Book("A", author , 13.13, 4);
       System.out.println(book);
    }  
}
