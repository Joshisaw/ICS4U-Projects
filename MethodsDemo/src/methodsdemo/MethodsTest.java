package methodsdemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 340889765
 */
public class MethodsTest {
    public static void main(String[]args){
        System.out.println(sumOfTheNumbers(10,4325));
    }
    public static int sumOfTheNumbers(int i,int s){
        int sum = 0;
        while(i<=s){
        sum = sum+i;
        i++;
        }
        return sum;

    }
    
}
