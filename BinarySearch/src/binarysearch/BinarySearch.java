/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.ArrayList;

/**
 *
 * @author 340889765
 */
public class BinarySearch {

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
        
        int low = 0;
        int target = 21;
        int high = numVal.size();
        int mid = 0;
        System.out.println(binarySearch(low,target,high,mid,numVal));
        
        
    }
    
    public static int binarySearch(int low,int target,int high, int mid, ArrayList<Integer> numVal){
        while(low<=high){
            mid = (low+high)/2;
            if(numVal.get(mid).equals(target)){
                return mid;
            }else if(numVal.get(mid)>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    
}
