
package assignment1;
import java.util.*;

/**
 *Java program to find all roots of a quadratic equation.
 * @author SHUBHAM
 */
public class Assignment8 {

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        double a,b,c;      //Quadratic Variables declaration
        System.out.println("Enter the value of a..");
        a=sc.nextDouble();   //Quadratic Variables Initialization
        System.out.println("Enter the value of b..");
        b=sc.nextDouble();    //Quadratic Variables Initialization
        System.out.println("Enter the value of c..");
        c=sc.nextDouble();   //Quadratic Variables Initialization
        
        double d=(b*b)-(4*a*c);    //Find the determinant
        double D= Math.sqrt(d);
        double r=2*a;
        
        //Check for Roots
        if(D>0)
        {
            System.out.println("Roots are real and unequal");
            double root1=(D-b)/r;
            double root2=(-D-b)/r;
            System.out.println("Roots are..");
            System.out.println(root1);
            System.out.println(root2);
        }
        else if(D==0)
        {
            System.out.println("The roots of the quadratic equation are real and equal.");
            double root=(-b)/r;
            System.out.println("Root is "+root);
        }
        else
        {
            System.out.println("The roots of the quadratic equation are complex and different");
            System.out.println("Roots are ");
            System.out.println((-b/r)+" +i" + D);
            System.out.println((-b/r)+" -i" + D);
        }
     }
}
    

