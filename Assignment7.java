package assignment1;
import java.util.*;

/**
 *Java Program to Find Largest Number Among Three Numbers
 * @author SHUBHAM
 */
public class Assignment7 {
    
    public static void main(String[] args)
    {
        int a,b,c;
       Scanner sc=new Scanner (System.in);
       
       System.out.println("Enter Three Numbers : ");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       
       if(a>b && a>c)
       {
           System.out.println(a+ " is a greatest Number !!");
       }
       if(b>a && b>c)
       {
           System.out.println(b+ " is a greatest Number !!");
       }
       else
           System.out.println(c+ " is a greatest Number !!");
       
    }
    
}
