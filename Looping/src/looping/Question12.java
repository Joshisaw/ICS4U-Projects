/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Please enter the length: ");
        int l = s.nextInt();
        System.out.print("Please enter the width: ");
        int w = s.nextInt();
        for(int i = 1; i<=w;i++){
            for(int o = 1; o<=l;o++){
            System.out.print("*");
            }
        System.out.println("");
       }
        for(int i = 1; i<=w;i++){
            for(int o = 1; o<=l;o++){
                if(i==1|o==1|o==l|i==w){
            System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println("");
       }

    }
}

