/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;

/**
 *
 * @author 340889765
 */
import java.util.*;
public class Tokenizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "This is a String, split by StringTokenizer, all in one line.";
        StringTokenizer st = new StringTokenizer(str," ");
        
        System.out.println("---- Split by space ------");
        while (st.hasMoreElements()){
            String curElement = (st.nextElement().toString());
            System.out.println(curElement);
        }
        
        System.out.println("---- Split by comma ------");
        StringTokenizer st2 = new StringTokenizer(str, ",");
        
        while(st2.hasMoreElements()){
            String curElement = (st2.nextElement().toString());
            System.out.println(curElement);
        }
        
    }
    
}
