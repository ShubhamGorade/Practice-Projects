
package assignment1;
import java.util.*;

/**
 *Java Program to Display Fibonacci Series..
 * @author SHUBHAM
 */
public class Assignment13 {
    public static void main(String[] args)
    {
        int n,first=0,second=1,third;
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter Any number for generating fibonancii Series :");
        n=sc.nextInt();
        
        System.out.print(first+" "+second);
        
        for(int i=2;i<=n;i++)
        {
            third=first+second;
            System.out.print(" "+third);
            first=second;
            second=third;
        }
    }
    
}
