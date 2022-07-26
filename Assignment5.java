
package assignment1;

import java.util.*;

/**
 *Java Program to Check Whether Number is Even or Odd
 * @author SHUBHAM
 */
public class Assignment5 {
    
    public static void main(String[] args)
    {
      int x;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter any Number : ");
      x=sc.nextInt();
      
      if(x%2==0)
      {
          System.out.println("Number is Even !!");
      }
      else
          System.out.println("Number is Odd !!");
    }
}