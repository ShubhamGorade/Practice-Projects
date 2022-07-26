
package assignment1;
import java.util.*;

/**
 *Java Program to Display Prime Numbers Between Two Intervals
 * @author SHUBHAM
 */
public class Assignment24 {
    
    public static void main(String[] args) {
   int low, high;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter Lower Interval : ");
  low=sc.nextInt();
  System.out.println("Enter Upper Interval : ");
  high=sc.nextInt();
while (low < high) {
boolean flag = false;
for(int i = 2; i <= low/2; ++i) {
    
if(low % i == 0) {
flag = true;
break;
}
}
if (!flag)
System.out.print(low + " ");
 ++low;
}
}
}
