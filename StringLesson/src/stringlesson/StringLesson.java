/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlesson;

/**
 *
 * @author 340889765
 */
public class StringLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String str = "abcdefgh";
        String newStr; System.out.println("01234567");
        System.out.println(str); 
        newStr = str.substring (3); // sets newStr to "defgh" 
        System.out.println(newStr);
        newStr = str.substring (1,3); // sets newStr to "bc" 
        System.out.println(newStr); 
        newStr = str.substring (0,3); // sets newStr to "abc" 
        System.out.println(newStr); 
        newStr = str.substring (1,4); // sets newStr to "bcd" 
        System.out.println(newStr);
        // to remove "def" from str to get "abcgh"
        newStr = str.substring(0,3) + str.substring(6); 
        System.out.println(newStr);*/
        
        // 1 2
        // 012345678901234567890123456
        String fruits = "apple orange pineapple kiwi";
        int findPos;
        findPos = fruits.indexOf('p'); // would return 1
        findPos = fruits.indexOf('p', 5); // would return 13
        findPos = fruits.lastIndexOf(' '); // would return 22 <-- counting BACKWARDS
        findPos = fruits.lastIndexOf(' ', 21); // would return 12 <-- counting BACKWARDS
        findPos = fruits.indexOf("apple"); // would return 0
        findPos = fruits.indexOf("apple", 3); // would return 17
        findPos = fruits.lastIndexOf("pp"); // would return 18
        findPos = fruits.lastIndexOf("pp", 14); // would return 1
        findPos = fruits.indexOf("banana"); // would return -1
        findPos = fruits.indexOf("orange", 12); // would return -1
        findPos = fruits.lastIndexOf("peach"); // would return -1
        findPos = fruits.lastIndexOf("kiwi", 12); // would return -1
        
        int intNumb = 345;
        double realNumb = 4.5;
        // to convert 345 to “345”
        String intStr = String.valueOf(intNumb);
        // To convert 4.5 to “4.5”
        String dblStr = String.valueOf(realNumb);
        System.out.println(intStr);
        System.out.println(dblStr);
        
        //type casting a string to an int
        String aStringNum = "123";
        int castInt = Integer.parseInt(aStringNum);
        int total = 23+castInt;
        System.out.println(total);
        //type cast to convert string to double
        String aDecimal = "890.45";
        double castDouble = Double.parseDouble(aDecimal);
        double multiplied = castDouble*2.5;
        System.out.println(multiplied);
        
        //more cast from double to int
        int theVal = (int)(27.34);
        System.out.println(theVal);
        
        //type cast from int to double
        double dVal = (double)(72);
        System.out.println(dVal);
        
        String searchWord = "aaa";
        System.out.print(searchWord.length ());
    }
    
}
