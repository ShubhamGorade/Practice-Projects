
package assignment1;

/**
 *Java Program to Remove all Characters in a String Except Alphabets..
 * @author SHUBHAM
 */
public class Assignment52 {
 public static void main(String args[])   
{  
String str= "This#string%contains^special*characters&.";   
str = str.replaceAll("[^a-zA-Z0-9]", " ");  
System.out.println(str);  
}  
}  
    
