/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testout;

/**
 *
 * @author 340889765
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.EOFException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TestOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, FileNotFoundException {
        // TODO code application logic here
        File fileOne = new File("BadPassword.txt");
        File fileTwo = new File("UserData.txt");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = s.nextLine();
        System.out.println("What is your password? ");
        String password = s.nextLine();
        String r = encrypt(password);
        String array[] = new String[3];
        array[0] = "hi";
        array[1] = "hi";
        array[2] = "hi";
        
        
        for(int i = 0;i<array.length;i++){
            PrintWriter output = new PrintWriter(fileTwo);
            output.println(array[i]);
            
        }
        output.close();

    }
    
    public static String encrypt(String password) throws NoSuchAlgorithmException{
        //java helper class to perform encryption
        MessageDigest md = MessageDigest.getInstance("MD5");
        //give the helper function the password
        md.update(password.getBytes());
        //perform the encryption
        byte byteData[] = md.digest();
        String sb1="";
        for (int i = 0; i < byteData.length; ++i) {
            sb1 += (Integer.toHexString((byteData[i] & 0xFF) | 0x100).substring(1,3));
        }
        return sb1;
    }
    
}
