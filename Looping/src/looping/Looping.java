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
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int count = 1;
        int x = 5;
        //For loop example
        for(int i = 0;i<=12;i=i+2){
            System.out.println("Im printing INCREASING for loop");
        }
        //for loop backwards
        for(int i = 40;i>=15;i=i-5){
            System.out.println("I'm printing a decreasing loop");
        }
        //WHILE loop
        while(x>=0){
            System.out.println("While loop x = "+x);
            x--;
        }
        //do while
        do{
            System.out.println("Do while loop x = "+x);
            x++;
        }while(x<7);
        //while example on char
        System.out.println("Keyboard keep goiing until you say y");
        char response = 'y';
        int theCounter = 0;
        while(response=='y'){
            System.out.println("Do you continue(y/n): ");
            response = keyboard.next().charAt(0);
            theCounter++;
        }
        System.out.println("You were asked "+theCounter+" times.");
        
    }
    
}
