
package assignment1;
import java .util.*;

/**
 *Java program to calculate sum of natural numbers..
 * @author SHUBHAM
 */
public class Assignment9 {
    public static void main(String[] args)
    {
        int num,i,sum=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Sum from :");
        i=sc.nextInt();
        
        System.out.println("Sum up to: ");
        num=sc.nextInt();
        
        while(i<=num)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of natural numbers = "+sum);
    }
    
}
