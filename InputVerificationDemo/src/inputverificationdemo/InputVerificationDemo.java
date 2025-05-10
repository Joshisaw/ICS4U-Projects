/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputverificationdemo;

/**
 *
 * @author 340889765
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputVerificationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double theInput = -90;
        char theOption = 'x'; //give an invalid value to start loop
        boolean rightFormat = false;
        System.out.print("Enter a decimal value between -10.0 and 10.0: ");
        do{
            try{
                
                Scanner s = new Scanner(System.in);
                theInput = s.nextDouble();
                if(theInput >= -10.0 && theInput <= 10.0){
                    rightFormat = true; //correct input recieved
                } else {
                    System.out.print("Enter a decimal value between -10.0 and 10.0: ");
                }
                
            }catch (InputMismatchException e){
                System.out.print("Enter a decimal value between -10.0 and 10.0: ");
            }
        }while(!rightFormat);
        System.out.println("Thanks! you enteed "+theInput);
        
        Scanner s = new Scanner(System.in);
        while(theOption!='a'&&theOption!='b'&&theOption!='c'){
            System.out.println("Please enter a b or c: ");
            theOption = s.nextLine().charAt(0);
        }
        System.out.println("Thanks! You selected option "+theOption);
    }
    
}
