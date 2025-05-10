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
public class FracExample2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction f = new Fraction(3,4);
        Fraction g = new Fraction(-1,2);
        Fraction h = f.plus(g);
        System.out.println(h);
    }
}
