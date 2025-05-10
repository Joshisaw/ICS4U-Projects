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
public class LoopingPractice {
    public static void main(String[] args) {
        //5 to 27 inclusive
        for(int i = 5; i<=27; i=i+2){
            System.out.println(i);
        }
        //starts at 3.2 and counts down to -7.4 by 0.2 inclusive
        for(double i = 3.2;i>=-7.4; i=i-0.2){
            System.out.println(i);
        }
        //while starts at 7 up to 45 by 3
        int num = 7;
        while(num<=45){
            System.out.println(num);
            num=num+3;
        }
        //do loop from -25 to -50 by 5 inclusive
        int w = -25;
        do{
            System.out.println(w);
            w=w-5;
        }while(w>=-50);
    }
}
