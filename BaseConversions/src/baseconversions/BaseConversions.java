/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconversions;

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class BaseConversions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("What is the binary number? ");
        String binaryLn = s.nextLine();
        System.out.println("Your number in base 10 is " + binaryToBase10(binaryLn));
    }
    public static int binaryToBase10(String binaryLn){
        int decOut = 0;
        int curPower;
        for(int i = binaryLn.length()-1;i>=0;i--){
            curPower = binaryLn.length()-1-i;
            decOut = decOut+Integer.parseInt(String.valueOf(binaryLn.charAt(i)))*(int)Math.pow(2,curPower);
        }
        return decOut;
    }
}
