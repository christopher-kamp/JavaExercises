/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4w2d4;

/**
 *
 * @author chris
 */
public class Exercise4W2D4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(3);
        rectangle1.setWidth(18);
        double perimeter = rectangle1.getPerimeter(rectangle1.getLength(), rectangle1.getWidth());
        double area = rectangle1.getArea(rectangle1.getLength(), rectangle1.getWidth());
        System.out.println("length: " + rectangle1.getLength());
        System.out.println("width: " + rectangle1.getWidth());
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);   
    } 
}
