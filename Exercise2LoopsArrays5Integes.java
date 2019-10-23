/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2loopsarrays5integes;

/**
 *
 * @author chris
 */
public class Exercise2LoopsArrays5Integes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numArr[] = {5, 14, 57, 8, 22};
        int sum = getSum(numArr);
        int sNumber = getSmallestNumber(numArr);
        int lNumber = getLargestNumber(numArr);
        float averageValue = getAverageValue(numArr, sum);
        
        System.out.println("Sum: " + sum);
        System.out.println("Smallest number: " + sNumber);
        System.out.println("Largest number: " + lNumber);
        System.out.println("Avarege number: " + averageValue);                
    }
    
    public static int getSum(int numArr[]){
        int sum = 0;
        for(int i=0;i<numArr.length;i++){
            sum+=numArr[i];
        }
        return sum;
    }
    
    public static int getSmallestNumber(int numArr[]){
        int sNumber = numArr[0];
        for(int i=0;i<numArr.length;i++){
            if(sNumber>numArr[i]){
                sNumber = numArr[i];
            }
        }
        return sNumber;
    }
    
    public static int getLargestNumber(int numArr[]){
        int lNumber = numArr[0];
        for(int i=0;i<numArr.length;i++){
            if(lNumber<numArr[i]){
                lNumber = numArr[i];
            }
        }
        return lNumber;
    }
    
    public static float getAverageValue(int numArr[],float sum){
        float av = sum/numArr.length;
        return av;
    }            
}
