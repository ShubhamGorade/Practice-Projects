
package assignment1;

import java.util.Scanner;

/**
 *Java Program to Reverse a Number
 * @author SHUBHAM
 */
public class Assignment16 {
  public static void main(String[] args) {

    int num , reversed = 0;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter any Number for reversing : ");
    num=sc.nextInt();
    
    System.out.println("Original Number: " + num);

    while(num != 0) {
    
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}
    

