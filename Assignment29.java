
package assignment1;
import java.util.Scanner;
/**
 *Java Program to Make a Simple Calculator to Add, Subtract, Multiply or Divide Using switch...case
 * @author SHUBHAM
 */
public class Assignment29 {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

     try (Scanner input = new Scanner(System.in)) {
          System.out.println("Choose an operator: +, -, *, or /");
          operator = input.next().charAt(0);
          
          System.out.println("Enter first number");
          number1 = input.nextDouble();
          
          System.out.println("Enter second number");
          number2 = input.nextDouble();
          
          switch (operator) {
              
              case '+':
                  result = number1 + number2;
                  System.out.println(number1 + " + " + number2 + " = " + result);
                  break;
                  
              case '-':
                  result = number1 - number2;
                  System.out.println(number1 + " - " + number2 + " = " + result);
                  break;
                  
              case '*':
                  result = number1 * number2;
                  System.out.println(number1 + " * " + number2 + " = " + result);
                  break;
                  
              case '/':
                  result = number1 / number2;
                  System.out.println(number1 + " / " + number2 + " = " + result);
                  break;
                  
              default:
                  System.out.println("Invalid operator!");
                  break;
          } }
  }
}

