// Write a java program for taking 5 subjects marks from user and calculate its total and Average.

import java.util.*;

class Marksheet
{
  public static void main(String args[])
  {
    int s1,s2,s3,s4,s5,total;
    float avg;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter CPP Marks : ");
    s1=sc.nextInt();

    System.out.println("Enter JAVA Marks : ");
    s2=sc.nextInt();

    System.out.println("Enter RDBMS Marks : ");
    s3=sc.nextInt();

    System.out.println("Enter Python Marks : ");
    s4=sc.nextInt();

    System.out.println("Enter DTMP Marks : ");
    s5=sc.nextInt();

    total=(s1+s2+s3+s4+s5);
    avg=(float)total/5;

    System.out.println("Total Marks = "+total);
    System.out.println("Average Marks = "+avg);
   }
}