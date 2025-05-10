/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findandreplace;

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class FindAndReplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the string to be searched: ");
        String theString = s.nextLine();
        System.out.print("Please enter the search pattern: ");
        String patternString = s.nextLine();
        System.out.print("Replace with: ");
        String replaceString = s.nextLine();
        int findPos = 0;
        int startPos = 0;
        String newString = "";
        
        while(findPos>-1){
        
        findPos = theString.indexOf(patternString, startPos);
        
            if(findPos>-1){
                newString = newString + theString.substring(startPos,findPos) + replaceString;
                startPos = findPos + patternString.length();
                findPos = findPos + patternString.length();
            }
        }
        newString = newString+theString.substring(startPos);
        System.out.println(newString);
    }
    
}
