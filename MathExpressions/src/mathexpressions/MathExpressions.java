/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathexpressions;

/**
 *
 * @author 340889765
 */
public class MathExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //rounding a decimal to the nearest 1 column
        double num = 7.645;
        double roundednum = Math.round(num);
        System.out.println(roundednum);
      //round a decimal to the nearest 10th
        double Num = 345.678;
        double roundedNum = Math.round(Num*10)/10.0; //make sure you add .0 so the computer knows its a decimal
        System.out.println(roundedNum);
      //sqrt a number
        double result = Math.sqrt(25.0);
        System.out.println(result);
      //raise a base to a power. Put decimals. Can vice versa with decimal powers
        double base = Math.pow(8.0,(1/3.0));
        System.out.println(base);
      //Volume of sphere
        double radius = 4.0;
        double volumeSphere = 4.0/3 * Math.PI * Math.pow(radius,3);
        System.out.println(volumeSphere);
      //random numbers 1 to 10
        int random1To10 = (int) (Math.random()*10)+1;
        System.out.println(random1To10);
      //random integers no limitations
        int random5To17 = (int) (Math.random()*13)+5;
        System.out.println(random5To17);
    }
    
}
