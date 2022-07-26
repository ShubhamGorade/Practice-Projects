
package assignment1;
import java.io.*;  
import java.util.*;  

/**
 *Java Program to Copy Strings from one file to another file.
 * @author SHUBHAM
 */
public class Assignment55 {
 public static void main(String arg[]) throws Exception {  
  Scanner sc = new Scanner(System.in);  
  System.out.print("Provide source file name :");  
  String sfile = sc.next();  
  System.out.print("Provide destination file name :");  
  String dfile = sc.next();  
  FileWriter fout;
     try (FileReader fin = new FileReader(sfile)) {
         fout = new FileWriter(dfile, true);
         int c;
         while ((c = fin.read()) != -1) {
             fout.write(c);
         }      System.out.println("Copy finish...");
     }  
  fout.close();  
 }  
}   
    
