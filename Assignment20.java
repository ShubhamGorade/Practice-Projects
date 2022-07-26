
package assignment1;
import java.util.*;

/**
 *Java Program to Find ASCII Value of a Character..
 * @author SHUBHAM
 */
public class Assignment20 {

    public static void main(String[] args) {
            
        char ch; 
        Scanner sc=new Scanner(System.in);
            
        System.out.println("Enter Any Character :");
        ch=sc.next().charAt(0);
        int ascii =ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
    

