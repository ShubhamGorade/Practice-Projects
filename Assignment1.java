
package assignment1;
import java.util.*;

/**
 *
Java Program to Add, subtract, multiply and divide Two Numbers
 * @author SHUBHAM
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c;
       Scanner sc=new Scanner(System.in);
       
       System .out.println("Enter First Number :");
       a=sc.nextInt();
       
       System .out.println("Enter Second Number :");
       b=sc.nextInt();
       
       c=a+b;
       System.out.println("Addition = "+c);
       
        c=a-b;
       System.out.println("Subtraction = "+c);
       
        c=a*b;
       System.out.println("Multiplication = "+c);
       
        c=a/b;
       System.out.println("Division = "+c);
    }
    
}

