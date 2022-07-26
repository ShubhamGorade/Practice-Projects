
package assignment1;

/**
 *
 * @author SHUBHAM
 */
public class Assignment53 {
    public static void main(String args[]){
 
  String helloWorld="This is hello world";
  System.out.println("length of helloWorld string :"+getLengthOfStringWithCharArray(helloWorld));
  }
 
public static int getLengthOfStringWithCharArray(String str)
{
  int length=0;
  char[] strCharArray=str.toCharArray();
  for(char c:strCharArray)
  {
   length++;
  }
  return length;
}
 
    
}
