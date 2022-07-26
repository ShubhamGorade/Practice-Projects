
package assignment1;
import java.util.*;
/**
 *Java Program to Calculate Power of a Number..
 * @author SHUBHAM
 */
public class Assignment17 {
    public static void main(String[] args)
    {
         int base, exponent;
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter Base: ");
         base=sc.nextInt();
         
         System.out.println("Enter Exponent: ");
         exponent=sc.nextInt();

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Answer = " + result);
  }
    
}
