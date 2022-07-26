
package assignment1;

/**
 * Java program to find GCD of n Numbers...
 * @author SHUBHAM
 */
public class Assignment14 {
    
  public static void main(String[] args) {
      
    int array[] = {15,50,60,80,40,20};
    int result = array[0];
 
    
    for(int i=1; i<array.length; i++){
      result = findGCD(array[i], result);
    }
    System.out.print("GCD: "+result);
  }
 
  //function to find GCD of two numbers
  public static int findGCD(int a, int b){
    if(b == 0)
      return a;
    return findGCD(b, a%b);
  }

}

    

