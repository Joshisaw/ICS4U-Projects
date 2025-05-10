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
public class Fraction {
    int num;
    int den;
    public Fraction(int n,int d){
        num = n;
        den = d;
    }
    public double asDecimal(){
        return (double)num/den;
    }
    public Fraction plus(Fraction other){
        Fraction temp = new Fraction(0,1);
        temp.num = num*other.den+other.num*den;
        temp.den = num*other.den;
        return temp;
    }
    public Fraction minus(Fraction other){
        Fraction temp = new Fraction(0,1);
        temp.num = num*other.den-other.num*den;
        temp.den = num*other.den;
        return temp;
    }
    public Fraction reduce(Fraction other){
        Fraction a = new Fraction(0,1);
        a.num = other.num;
        a.den = other.den;
        for(int i = 2;i<10;i++){
            int x = a.num%i;
            int y = a.den%i;
            if(x==0&&y==0){
                a.num = a.num/i;
                a.den = a.den/i;
            }
        }
        return a;
    }
    public String toString(){
        return num + " / " + den;
    }
}
