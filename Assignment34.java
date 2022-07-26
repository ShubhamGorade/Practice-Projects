
package assignment1;

/**
 *Java program to Calculate Factorial of a Number Using Recursion
 * @author SHUBHAM
 */
public class Assignment34 {
    static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
   int i,fact;  
  int number=8;  
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
    
