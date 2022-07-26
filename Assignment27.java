
package assignment1;

/**
 *Java Program to Display Factors of a Number
 * @author SHUBHAM
 */
public class Assignment27 {
     public static void main(String[] args) {

    int number = 100;

    System.out.print("Factors of " + number + " are: ");

    for (int i = 1; i <= number; ++i) {

      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
    

