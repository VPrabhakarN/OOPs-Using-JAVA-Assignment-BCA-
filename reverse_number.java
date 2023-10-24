/* Java program to reverse the number entered by the user */

import java.util.*;
public class reverse_number {
    public static void main(String args[])
    {
        //create an instance for scanner  class
        Scanner sc = new Scanner(System.in);

        //Now take input from the user 
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int rev = 0;

        //using while loop
        while(number != 0)
        {
            int rem = number%10;
            rev = rev*10+rem;
            number = number/10;
        }
        System.out.println("Reverse is "+rev);
    }   
}
