
package assignment1;
import java.util.Scanner;

/**
 *Java Program to Check Whether a Number is Palindrome or Not
 * @author SHUBHAM
 */
public class Assignment22 {
   public static void main(String args[]){  
  int r,sum=0,temp,n; 
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter Any Number : ");
  n=sc.nextInt();
  
  temp=n;    
  while(n>0){    
   r=n%10;    
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number !!! ");    
  else    
   System.out.println("not palindrome !!!");    
}  
}  
    
    

