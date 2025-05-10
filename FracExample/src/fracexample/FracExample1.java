/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracexample;

/**
 *
 * @author 340889765
 */
public class FracExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction f = new Fraction(3,4);
        System.out.println(f + "=" + f.asDecimal());
        Fraction g = new Fraction(-1,2);
        System.out.println(g + "=" + g.asDecimal());
    }
    
}
