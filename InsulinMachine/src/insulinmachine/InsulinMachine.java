/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insulinmachine;

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class InsulinMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        double insulinVal = 0;
        boolean tryCatch = false;
        do{
            try{
                System.out.print("Enter a current Blood Glucose Level (mg/dL): ");
                insulinVal = Double.parseDouble(s.nextLine());
                if(insulinVal < 0){
                    System.out.println("Error. Please check your strips.");
                    tryCatch = false;
                } else if(0<=insulinVal && insulinVal<70){
                    System.out.println("Please see your physician about hypoglycemia.");
                    tryCatch = false;
                } else {
                    System.out.println(theDose(insulinVal));
                }
            }catch(NumberFormatException e){
                System.out.println("Enter a decimal value.");
                tryCatch = false;
            }
        }while(!tryCatch);
    }
    
    public static String theDose(double insulinVal){
        
        int dose = (int)(149.556*Math.pow(1.00035, insulinVal)-152.638);
        String msg;
        if(dose > 20){
            msg = "Administer 20 units. See physician about hyperglycemia.";
        }else{
            msg = "Administer " + Integer.toString(dose) + " units of insulin";
        }
        return msg;
    }
    
}
