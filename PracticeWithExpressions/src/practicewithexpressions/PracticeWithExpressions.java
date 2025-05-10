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
public class PracticeWithExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in); //sets up scanner variable
        System.out.print("Please enter the radius of the cylinder: ");
        double radius = s.nextDouble(); //allows user to input double and sets to radius
        
        System.out.print("Please enter tne height of the cylinder: ");
        double height = s.nextDouble(); //allows user to iinput double and sets to height
        
        double SA = 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius, 2.0); //does calculations for SA
        double volume = Math.PI*Math.pow(radius, 2.0)*height; //does calculations for volume
        
        double roundedSA = Math.round(SA*10)/10.0; //rounds SA to tenth
        double roundedvolume = Math.round(volume*10)/10.0; //rounds volume to tenth
        
        System.out.println("Therefore, you volume is " + roundedvolume + " units squared and your surface area is " + roundedSA + " units cubed");
    }
    
}
