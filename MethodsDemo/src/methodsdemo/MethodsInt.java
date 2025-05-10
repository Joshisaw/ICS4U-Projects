/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsdemo;

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class MethodsInt {
    
    public static void main (String[]args){
        System.out.print("Please enter your age: ");
        Scanner s = new Scanner (System.in);
        int humanAge = s.nextInt();
        //canineage is local variable that stores value back from dogsAge method
        int canineAge = dogsAge(humanAge);
        System.out.println("You are " + canineAge + " years old in dogs years");
    }
    public static int dogsAge(int humanAgeIn){
        //int method recieves an int and returns an int
        int dAge = humanAgeIn * 7;
        return dAge; //sends back the result to a calling method
        //nothing after return
    }
    
}
