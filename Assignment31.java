
package assignment1;

/**
 *Java Program - Check if Number is Prime Number
 * @author SHUBHAM
 */
public class Assignment31 {
  public static void main(String[] args) {
        System.out.println("Is 67 prime : "+isPrime(67));
        System.out.println("Is 40 prime : "+isPrime(40));
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}