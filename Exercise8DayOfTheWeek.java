/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8dayoftheweek;
/**
 *
 * @author chris
 */
public class Exercise8DayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int day = 2;        
        getDayOfTheWeek(day);
    }
    
    public static void getDayOfTheWeek(int dayNumber){
        
        switch(dayNumber){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuseday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saterday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Number use 1-7");
                break;    
        }        
    }        
}
