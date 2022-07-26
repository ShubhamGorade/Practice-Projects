
package assignment1;

/**
 *Java Program to Convert Binary Number to Decimal and vice-versa
 * @author SHUBHAM
 */
public class Assignment36 {
    public static void main(String[] args) {

    // binary number
    long num = 110110111;

    // call method by passing the binary number
    int decimal = convertBinaryToDecimal(num);

    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
    
    int no = 19;
    System.out.println("Decimal to Binary");

    // call method to convert to binary
    long binary = convertDecimalToBinary((int) no);

    System.out.println("\n" + no+ " = " + binary);
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
  public static long convertDecimalToBinary(int n) {

    long binaryNumber = 0;
    int remainder, i = 1, step = 1;

    while (n!=0) {
      remainder = n % 2;
        System.out.println("Step " + step++ + ": " + n + "/2");

        System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
        n /= 2;

        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }
}
