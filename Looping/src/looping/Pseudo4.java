package looping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 340889765
 */
import java.util.Scanner;
public class Pseudo4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int markCount = 0;
        int num = s.nextInt();
        int max = num;
        int min = num;
        int totalMark = 0;
        while(num!=-9){
            markCount++;
            if(num>max){
                max = num;
            }else if(num<min){
                min = num;
            }else{
                
            }
            totalMark=totalMark+num;
            System.out.print("Please enter a number: ");
            num = s.nextInt();
        }
        int theAverage = totalMark/markCount;
        System.out.println("Your average is " + theAverage);
    }
    
}
