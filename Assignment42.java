
package assignment1;

/**
 *Java Program to Find Largest Element of an Array
 * @author SHUBHAM
 */
public class Assignment42 {
    public static int getLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-1];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,8,3,2};  
int b[]={44,66,99,100,150,77,33,22,55};  
System.out.println("Largest: "+getLargest(a,7));  
System.out.println("Largest: "+getLargest(b,9));  
}}  

