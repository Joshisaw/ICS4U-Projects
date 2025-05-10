/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortarraylistdemos;

/**
 *
 * @author 340889765
 */
import java.util.ArrayList;
import java.util.List;
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> sorted = new ArrayList<>();
        sorted.add(21);
        sorted.add(1);
        sorted.add(5);
        sorted.add(9);
        sorted.add(2);
        int i = 0;
        while(i< sorted.size()-1){
            int minVal = i;
            int j = i+1;
            while(j<sorted.size()){
                if(sorted.get(j)<sorted.get(minVal)){
                    minVal = j;
                }
                j++;
            }
            int temp = sorted.get(minVal);
            sorted.set(minVal,sorted.get(i));
            sorted.set(i,temp);
            i++;
        }
        
        for(int s = 0;s<sorted.size();s++){
            System.out.println(sorted.get(s));
        }
    }
    
}
