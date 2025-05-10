/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class Practice5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String currentClosest;
        boolean trueFalse = true;
        do{
            String userInput = input.nextLine();
            if(trueFalse && userInput.compareTo("zzz")!=0){
                currentClosest = userInput;
                trueFalse = false;
            }
            int compare = userInput.compareTo(currentClosest);
            if(compare<0 && userInput.compareTo("zzz")!=0){
                currentClosest = userInput;}
        }while(userInput.compareTo("zzz")!=0);
        System.out.println(currentClosest);
    }
    
}
