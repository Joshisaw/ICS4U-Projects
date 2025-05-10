/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicfileio;

/**
 *
 * @author 340889765
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class BasicFileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("test.txt");
        try{
            PrintWriter output = new PrintWriter(file);
            output.println("Mr.Payne");
            output.println(17);
            output.close();
        }catch(IOException ex){
            System.out.printf("Error :%s\n",ex);
        }
        
        try{
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();
            
            System.out.printf("Name: %s Age: %d\n", name,age);
        }catch(FileNotFoundException ex){
            System.out.printf("Error: %s\n",ex);
        }
    }
    
}
