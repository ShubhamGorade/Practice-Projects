
package assignment1;
import java .util.*;

/**
 *Java program to check leap year..
 * @author SHUBHAM
 */
public class Assignment10 {
    public static void main(String[] args)
    {
        int x;
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter Year : ");
        x=sc.nextInt();
        
        if(x%4==0)
        {
            System.out.println(x+" is a leap year !!!");
        }
        else
            System.out.println(x+ " is not a leap year !!!");
    }
    
}
