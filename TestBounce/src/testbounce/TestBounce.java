/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbounce;

/**
 *
 * @author 340889765
 */
import java.util.List;
import java.util.ArrayList;
public class TestBounce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> coordinates = new ArrayList<Integer>();
        coordinateGenerator(50,0,0,coordinates);
        for(int i = 0;i<coordinates.size();i++){
            if(i%2 == 0){
                coordinates.get(i);
                System.out.println();
            }else{
                //System.out.println("Y:" + coordinates.get(i));
                for(int p = 0;p<coordinates.get(i);p++){
                    System.out.print("*");
                    
                }
            }
        }
    }
    
    public static ArrayList<Integer> coordinateGenerator(int distanceX, int xIntercept1, int xIntercept2, ArrayList<Integer> coordinates){
        int newYPoint;
        if(distanceX<1){
            return coordinates;
        }else{
            distanceX = distanceX/2;
            xIntercept2 = xIntercept1;
            xIntercept1 = xIntercept1+distanceX;
            for(int s = xIntercept2;s<xIntercept1;s++){
                coordinates.add(s);
                newYPoint = (int)(-0.1*(s-xIntercept1)*(s-xIntercept2));
                coordinates.add(newYPoint);
            }
            return coordinateGenerator(distanceX,xIntercept1,xIntercept2, coordinates);
        }
    }
    
}
