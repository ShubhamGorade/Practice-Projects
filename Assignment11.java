
package assignment1;
import java.util.*;

/**
 *Java program to find factorial of a number..
 * @author SHUBHAM
 */
public class Assignment11 {
    
    public static void main(String[] args)
    {
        int i,n,fac=1;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Any Number :" );
        n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        System.out.println("Factorial of "+n+ " is "+fac);
    }
    
}
