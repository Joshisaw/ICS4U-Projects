/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlesson;

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class Exercises {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /*System.out.print("Please enter a String: ");
        String input = s.nextLine().toUpperCase();
        int length;
        char output;
        
        for(length = input.length()-1;length>=0;length--){
            output = input.charAt(length);
            System.out.print(output);
        }*/
        
        System.out.print("Please enter a name: ");
        String name = s.nextLine();
        int len = name.length();
        int space = name.lastIndexOf(' ');
        
        
    }
    
}
