
package assignment1;
import java.util.*;
/**
 *Increment ++ and Decrement -- Operator Overloading in Java Programming..
 * @author SHUBHAM
 */
public class Assignment18 {
    
   public static void main(String[] args)
   {
       int a = 1;
        int b = 2;
        int c;
        int d;
        
       System.out.println( "increment Operator Overloding");
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        
        System.out.println("Decrement Operator Overloding");
        int x=5;
        int y=10;
        int e;
        int f;
        
        e = --x;
        f = y--;
        x--;
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("e = " +e);
        System.out.println("f = " +f);
   }
}
