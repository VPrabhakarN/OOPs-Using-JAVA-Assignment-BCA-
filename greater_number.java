/* Java program to check which is greater number from the given numbers */

import java.util.*;
public class greater_number {
   public static void main(String args[])
   {
    //create an instance for scanner class
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    
    System.out.println("Enter first number : ");
    a = sc.nextInt();
    System.out.println("Enter second number : ");
    b = sc.nextInt();
    System.out.println("Enter third number : ");
    c = sc.nextInt();

    //using if_elseif statement 
    if(a>=b && a>=c)
    {
        System.out.println( a + " is greater greater number !");
    }
    else if(b>=a && b>=c)
    {
        System.out.println( b + " is the greater number !");
    }
    else 
    {
        System.out.println( c + " is the greater number !");
    }
   } 
}
