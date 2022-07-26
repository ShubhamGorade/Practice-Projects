package assignment1;

import java.util.*;
/**
 * Java Program to Check Whether a character is Vowel or Consonant.
 * @author SHUBHAM
 */
public class Assignment6 {
  
	
	public static void main(String[] args) {
		
		char ch;
		Scanner sc=new Scanner(System.in);

		System.out.print("Please Enter any Character =  ");
		ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
		{
			System.out.println(ch + " is Vowel");
		}
                else if((ch>='a'&& ch<='z') ||(ch>='A'&& ch<='Z'))
		{
			System.out.println(ch + " is Consonant");
		}
                else
                    System.out.println( ch +" is Neither Vowel nor Consonant");
	}
}
    

