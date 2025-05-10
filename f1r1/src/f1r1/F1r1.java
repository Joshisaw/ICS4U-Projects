/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f1r1;

/**
 *
 * @author 340889765
 */
public class F1r1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String theString = "Mississippi";
        String newString ="";
        String fString = "iss";
        String rString = "ott";
        int findPos = 0;
        int startPos = 0;
        System.out.println("01234567890");
        System.out.println(theString);
        
        
        
        while(findPos>=0){
            findPos = theString.indexOf(fString,findPos);
            System.out.println(findPos);
            if(findPos>=0){
            newString = newString + theString.substring(startPos,findPos)+rString;
              //      +theString.substring(findPos+fString.length());
            System.out.println("01234567890");
            System.out.println(newString);
            
            findPos = findPos+fString.length();
            startPos = findPos;
            }
        }
        
        newString = newString+theString.substring(startPos);
        System.out.println(newString);
    }
    
}
