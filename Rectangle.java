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
public class Rectangle {
    private double length = 1;
    private double  width = 1;
    
    public void setLength(double length){
        if(length > 0 && length <20){
            this.length = length;
        }
    }
    
    public void setWidth(double width){
        if(width > 0 && width <20){
            this.width = width;
        }
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getWidth(){
        return this.width;
    }
   
    public double getPerimeter(double length, double width){
        double perimeter = 2 * (length + width);
        return perimeter;
    }
    
    public double getArea(double length,double width){
        double area = length * width;
        return area;
    }
    
    
    
    
}
