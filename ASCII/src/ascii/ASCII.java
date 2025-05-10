/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii;

/**
 *
 * @author 340889765
 */
public class ASCII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] letters = new char[20];
        int randomChar;
        for(int i = 0; i<letters.length ; i++){
            randomChar = (int) (Math.random()*3)+1;
            if(randomChar == 1){
                letters[i] = 'a';
            }else if(randomChar == 2){
                letters[i] = 'c';
            }else if(randomChar == 3){
                letters[i] = 't';
            }
        }
        for(int i = 0; i < letters.length;i++){
            if(letters[i] == 'a'){
            }else {
                System.out.println(letters[i]);
            }
        }
        int [] stats = new int[3];
        int counterC = 0;
        int counterA = 0;
        int counterT = 0;
        for(int i = 0;i < letters.length;i++){
        if(letters[i] == 'c'){
            counterC++;
        }else if(letters[i] == 'a'){
            counterA++;
        }else if(letters[i] == 't'){
            counterT++;
            }
        }
        stats[0] = counterC;
        stats[1] = counterA;
        stats[2] = counterT;
        System.out.println(stats[0]);
        
        
    }
    
}
