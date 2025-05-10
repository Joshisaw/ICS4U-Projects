/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicewithexpressions;

/**
 *
 * @author 340889765
 */
import java.util.Scanner; //imports scanner
public class RoundMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //declares scanner variable
        System.out.print("Please input a number: ");
        double number = s.nextDouble(); //asks user to input number and sets to number
        System.out.print("Please enter the precision(1,10,100,1000): ");
        int precision = s.nextInt(); //asks user to input a precision
        
        int rounded = (int)Math.round(number/precision)*precision; //calculates the rounded number
        
        System.out.println("Your rounded number to the nearest " + precision + "th is " + rounded);
    }
    
}
