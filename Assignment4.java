
package assignment1;

import java.util.*;

/**
 *Java Program to Swap Two Numbers
 * @author SHUBHAM
 */
public class Assignment4 {
    
    public static void main(String[] args)
    {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter First Number:");
        a=sc.nextInt();
        
        System.out.println("Enter Second Number:");
        b=sc.nextInt();
        
        System.out.println("** Before Swapping **");
        System.out.println("a="+a+"\tb="+b);
        
        temp=a;
        a=b;
        b=temp;
        System.out.println("** After Swapping **");
        System.out.println("a="+a+"\tb="+b);
    }
    
}
