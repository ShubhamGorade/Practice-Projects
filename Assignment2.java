
package assignment1;
import java.util.*;

/**
 *
 * @author SHUBHAM
 */
public class Assignment2 
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Dividend:");
        a=sc.nextInt();
        
        System.out.println("Enter Divisor:");
        b=sc.nextInt();
        
        c=a/b;
        System.out.println("Quotient = "+c);
        
        c=a%b;
        System.out.println("Remainder = "+c);
        
    }
}
    
