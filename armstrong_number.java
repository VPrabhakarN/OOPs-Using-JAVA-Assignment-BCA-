/*Java program to find the given number is armstrong or not */

import java.util.Scanner;
public class armstrong_number {
    public static void main(String args[])
    {
        int n, cubesume=0, num, r;

        //create instance for scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input from the user 
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        num = n;

        //using while loop
        while(num>0)
        {
            r = num%10;
            cubesume = cubesume+(r*r*r);
            num = num/10;
        }

        //now we use if_else statement
        if(n==cubesume)
        {
            System.out.println("The number is Armstrong!");
        }
        else
        {
            System.out.println("The number is not Armstrong!");
        }
    }
    
}
