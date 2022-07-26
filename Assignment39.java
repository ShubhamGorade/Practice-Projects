
package assignment1;

/**
 Java program to Reverse a Sentence Using Recursion
 * @author SHUBHAM
 */
public class Assignment39 {
     public static void main(String[] args) {
    String sentence = "How are you ?";
    System.out.println("The Original sentence is: " + sentence);
    String reversed = reverse(sentence);
    System.out.println("The reversed sentence is: " + reversed);
  }

  public static String reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
 