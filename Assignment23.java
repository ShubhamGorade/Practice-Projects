
package assignment1;
import java.util.*;

/**
 *Java Program to Check Whether a Number is Prime or Not
 * @author SHUBHAM
 */
public class Assignment23 {
public static void main(String args[]){    
  int i,m,flag=0,n;      
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter Any Number : ");
  n=sc.nextInt();
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  } 
}    
}   
    
   
