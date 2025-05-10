/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author 340889765
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String oddOrEven;


for(int i = 3; i<=20; i++){


if(i%2 == 1){
oddOrEven = "ODD";
}else{
oddOrEven = "EVEN";
}

System.out.println(i + " " + oddOrEven);
}
    }
    
}
