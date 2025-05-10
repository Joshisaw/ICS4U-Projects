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
public class MethodsDemo {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        //import void method
        helloworld();
        hiFiveOrSo(120);
        
    }
    public static void helloworld(){
        System.out.println("Hello World");
        //void doesn't return any value
        //to the calling method
        //so there is no return statement here
    }
    public static void hiFiveOrSo(int numHighs){
        //int numHighs is a formal parameter for the method
        for(int i = 1; i<=numHighs;i++){
            System.out.println("This is high five #"+ i);
            //void doesn't return anything
        }
    }
    
}
