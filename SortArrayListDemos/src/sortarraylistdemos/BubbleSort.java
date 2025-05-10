package sortarraylistdemos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 340889765
 */
import java.util.ArrayList;
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 5;
        ArrayList<Integer> numVal = new ArrayList<>();
        numVal.add(21);
        numVal.add(1);
        numVal.add(5);
        numVal.add(9);
        numVal.add(2);
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0;i<count-1;i++){
                if(numVal.get(i)>numVal.get(i+1)){
                    sorted = false;
                    int temp = numVal.get(i);
                    int random = numVal.set(i, numVal.get(i+1));
                    int random2 = numVal.set(i+1, temp);
                }
            }
        }
        for(int s = 0;s<numVal.size();s++){
            System.out.println(numVal.get(s));
        }
    }
    
}
