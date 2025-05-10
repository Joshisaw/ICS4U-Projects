/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;

/**
 *
 * @author 340889765
 */
import java.util.*;
public class LineParse {
    
        public static boolean typeVerify(String tIn, char t){
        boolean goodVal = false;
        try{
            switch(t){
                case 'i':
                    int var1 = Integer.parseInt(tIn);
                    goodVal = true;
                break;
                case 'd':
                    double var2 = Double.parseDouble(tIn);
                    goodVal = true;
                break;
                case 's':
                    char var3 = tIn.charAt(0);
                    int ascii = (int)var3;
                    if(ascii>=65 && ascii<=122)
                        goodVal = true;
                break;
            }
        }catch(NumberFormatException e){
            goodVal = false;
        }
        return goodVal;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] tList = {'i', 'd', 's'};
        boolean currentGood;
        boolean tCounter = false;
        Scanner s = new Scanner(System.in);
        
        while(!tCounter){
            tCounter = true;
            int i = 0;
            System.out.print("Enter Int, Double and String: ");
            String dataIn = s.nextLine();
            StringTokenizer dataItems = new StringTokenizer(dataIn,",");
            
            while(dataItems.hasMoreElements()){
                String curElement = (dataItems.nextElement().toString());
                currentGood = typeVerify(curElement,tList[i]);
                i++;
                if(currentGood){
                    System.out.println(curElement);
                }
                else{
                    System.out.println("Incorrect Data Entry");
                    tCounter = false;
                }
            }
        }
        System.out.println("Good job, you printed all correctly!");
        
    }
    
}
