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
public class MethodsString {
    
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your noun: ");
        String n = s.next();
        System.out.print("Please enter your adverb: ");
        String a = s.next();
        System.out.print("Please enter your verb: ");
        String v = s.next();
        System.out.println(sentenceMaker(n,a,v));
    }
    public static String sentenceMaker (String noun, String adverb, String verb){
        //recieves three formal parameter
        String theSentence = noun + ' ' + verb + ' ' + adverb + '.';
        return theSentence;
        //nothing after
    }
    
}
