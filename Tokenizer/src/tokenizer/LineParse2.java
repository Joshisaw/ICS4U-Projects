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
//imports class
public class LineParse2 {
    
        public static boolean typeVerify(String tIn, char t){
        //method to verify type
        boolean goodVal = false;
        //set boolean as false
        try{
        //try command
            switch(t){
            //implement array
                case 'i':
                //if value is i
                    int var1 = Integer.parseInt(tIn);
                    //try to turn string into an int
                    goodVal = true;
                    //if no error set boolean as good
                    System.out.println("Good Int");
                break;
                case 'd':
                //if value is d
                    double var2 = Double.parseDouble(tIn);
                    //try to turn string into a double
                    goodVal = true;
                    //if no error set boolean as good
                    System.out.println("Good Double");
                break;
                case 's':
                    char var3 = tIn.charAt(0);
                    //finds first letter on entered String
                    int ascii = (int)var3;
                    //cast as an int
                    if(ascii>=65 && ascii<=122){
                    //if letter is between a-z and A-Z
                        goodVal = true;
                        //set boolean as good
                        System.out.println("Good String");
                    }
                break;
            }
        }catch(NumberFormatException e){
        //if there was an error parsing
            goodVal = false;
            //set boolean as false
        }
        return goodVal;
        //return boolean value
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] tList = {'i', 'd', 's'};
        //declare an array with all diff values to enter
        boolean currentGood;
        //set boolean for a while loop counter
        boolean tCounter = false;
        //set a while loop counter as false
        Scanner s = new Scanner(System.in);
        //declare scanner
        
        while(!tCounter){
        //while counter is false
            tCounter = true;
            //set as true. If anything is wrong set to true
            int i = 0;
            //set i as zero
            System.out.print("Please enter an int, double and string (all"
                    + " seperated by commas): ");
            String dataIn = s.nextLine();
            //find next line
            StringTokenizer dataItems = new StringTokenizer(dataIn,",");
            //grabs data line and seperates values with , and make as a tokenizer
            
            while(dataItems.hasMoreElements()){
            //if there are more items keep running
                String curElement = (dataItems.nextElement().toString());
                //convert each token to string
                currentGood = typeVerify(curElement,tList[i]);
                //take that value and judge if it is convertable
                if(currentGood){
                }
                else{
                    switch(tList[i]){
                        case 'i':
                            System.out.println("***Value must be an Int***");
                        break;
                        case 'd':
                            System.out.println("***Value must be an Double***");
                        break;
                        case 's':
                            System.out.println("***Value must be an String***");
                        break;
                    }
                    tCounter = false;
                }
                i++;
            }
            if(i!=3){
                System.out.println("***Please enter enough data***");
                tCounter = false;
            }
        }
        System.out.println("Good job, you printed all correctly!");
    }
}
