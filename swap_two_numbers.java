/*Java program to swap two numbers */

import java.util.*;
public class swap_two_numbers {
    public static void main(String args[])
    {
        int x, y,t;
        
        //create an instance for scanner class
        Scanner sc = new Scanner (System.in);

        //taking input from user
        System.out.println("Enter the value of x and y : ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before swapping : "+ x + " " + y);

        //swapping 
        t = x;
        x = y;
        y = t;

        System.out.println("After Swapping : "+ x + " " + y);
        System.out.println(" ");
    }
    
}

