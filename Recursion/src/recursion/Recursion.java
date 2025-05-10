/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author 340889765
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        exp(2,8);
        
    }
    
    public static int exp(int x, int i){
        System.out.println(x);
        System.out.println(i);
        if(i==0){ return 1;}
        if(i==1){return x;}
        return x*exp(x,i-1);
    }
    
}
