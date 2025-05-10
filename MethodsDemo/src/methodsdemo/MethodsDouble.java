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
public class MethodsDouble {
    
    public static void main(String[]args){
        System.out.println("Enter the temperature you want to convert: ");
        Scanner s = new Scanner(System.in);
        double tempIn = s.nextDouble();
        String gunk = s.nextLine();
        System.out.print("To celcius 'c' or To fahrient 'f'? ");
        char cWay = s.nextLine().charAt(0);
        double tempBack = sendBackTemp(tempIn,cWay);
        System.out.println(tempBack);
    }
    public static double sendBackTemp(double temperatureIn, char conversionType){
        //temperatureIn and conversionType are the formal parameters
        double convertedVal;
        if(conversionType == 'c'){
            convertedVal = (temperatureIn - 32)/1.8;
        }else if(conversionType == 'f'){
            convertedVal = temperatureIn*1.8 + 32;
        }else{
            System.out.println("You submitted an invalid conversion");
            convertedVal = -999;
        }
        return convertedVal;
    }
    
}
