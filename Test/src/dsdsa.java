/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 340889765
 */
public class dsdsa {
    public static void main(String[] args) {
        // TODO code application logic here
        String original = "nah man you trapping";
        String changed = "";
        int findPos = 0;
int startPos = 0;

while(findPos>-1){
findPos = original.indexOf('a', findPos);
if(findPos>-1){
changed = changed + original.substring(startPos, findPos) + 'o';
findPos++;
startPos = findPos;
}
}
changed = changed + original.substring(startPos);
System.out.println(changed);
    }
}