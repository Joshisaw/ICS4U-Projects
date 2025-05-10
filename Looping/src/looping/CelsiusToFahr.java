/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class CelsiusToFahr {
    public static void main(String[] args) {
        double cEnd, cStart, fahr;
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter starting celcius: ");
        cStart = s.nextDouble();
        System.out.print("Please enter ending celcius: ");
        cEnd = s.nextDouble();
        System.out.println("Celsius   Fahrenheit");
        do{
            fahr = cStart*1.8+32;
            System.out.println(cStart+ "       "+fahr);
            
            cStart++;
        }while(cStart<=cEnd);
    }
    
}
