package assignment1;

/**
 *Java Program to Convert Octal Number to Decimal and vice-versa..
 * @author SHUBHAM
 */
public class Assignment37 {
    public static void main(String[] args) {
        
        int decimal = 78;
        int octal = convertDecimalToOctal(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
        
        int octalnum = 116;
        int decimalnum = convertOctalToDecimal(octalnum);
        System.out.printf("\n%d in octal = %d in decimal", octal, decimal);
    }

    public static int convertDecimalToOctal(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }
    
    public static int convertOctalToDecimal(int octal)
    {
        int decimalNumber = 0, i = 0;

        while(octal != 0)
        {
            decimalNumber += (octal % 10) * Math.pow(8, i);
            ++i;
            octal/=10;
        }

        return decimalNumber;
    }
}


