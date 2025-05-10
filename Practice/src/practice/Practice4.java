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
import java.util.*;
public class Practice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String thing = s.next();
        try{
            int i = Integer.parseInt(thing);
            System.out.println("hi");
        }
        catch(NumberFormatException e){
            System.out.println("monkey");
        }
    }
    
}
