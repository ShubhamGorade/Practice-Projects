
package assignment1;

/**
 *Java Program to Convert Binary Number to Octal and vice-versa
 * @author SHUBHAM
 */
public class Assignment38 {
    public static void main(String[] args) {
    long binary = 101011;
    int octal = convertBinarytoOctal(binary);
    System.out.println(binary + " in binary = " + octal + " in octal");
    
    int octalnum = 97;
    long binarynum = convertOctalToBinary(octal);
    System.out.println(octalnum + " in octal = " + binarynum + " in binary");
  }

  public static int convertBinarytoOctal(long binaryNumber) {
    int octalNumber = 0, decimalNumber = 0, i = 0;

    while (binaryNumber != 0) {
      decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
      ++i;
      binaryNumber /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      octalNumber += (decimalNumber % 8) * i;
      decimalNumber /= 8;
      i *= 10;
    }

    return octalNumber;
  }
  public static long convertOctalToBinary(int octalNumber) {
    int decimalNumber = 0, i = 0;
    long binaryNumber = 0;

    while (octalNumber != 0) {
      decimalNumber += (octalNumber % 10) * Math.pow(8, i);
      ++i;
      octalNumber /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      binaryNumber += (decimalNumber % 2) * i;
      decimalNumber /= 2;
      i *= 10;
    }

    return binaryNumber;
  }
}

    

