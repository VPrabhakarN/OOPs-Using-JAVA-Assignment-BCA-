/*Java Program to find the given number is palindrome or not */

import java.util.*;
public class palindrome_number {
    public static void main(String args[])
    {
        //create instance for scanner class
        Scanner s = new Scanner(System.in);
        
        //now take input from user 
        System.out.println("Enter a number : ");
        String reverse =" ";
        String num = s.nextLine();
        int length = num.length();

        //using for loop
        for(int i = length-1; i>=0; i--)
        {
        reverse = reverse+num.charAt(i);
        }

        if(num.equals(reverse))
        {
            System.out.println("The entered string "+ num+" is a palindrome");
        }
        else 
        {
            System.out.println("The entered string "+ num+" is not a palindrome");
        }
    }
    
}
