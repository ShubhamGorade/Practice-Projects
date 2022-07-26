
package assignment1;
import java.util.*;

/**
 * Java program to Generate Multiplication table..
 * @author SHUBHAM
 */
public class Assignment12 {
    public static void main(String[] args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter Any Number : ");
        n=sc.nextInt();
        
        System.out.println("Multiplication Table of " +n);
        for(i=1;i<=10;i++)
        {
          System.out.println(+n+" * "+i+ " = " +(n*i));
        }
    }
}  
