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
import java.util.Scanner;
public class SliceOfPizza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of pizzas that you ate: ");
        double pizza = s.nextDouble();
        
        double calories = pizza * 355;
        
        double time = calories/550;
        
        double roundedtime = Math.round(time*100)/100;
        System.out.println("You have to cycle for " + roundedtime + " hours to burn off the pizza");
    }
}
