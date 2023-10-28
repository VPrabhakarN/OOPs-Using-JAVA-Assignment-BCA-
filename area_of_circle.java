/* Java program to find the area of circle  */

import java.util.*;
public class area_of_circle {
    public static void main(String args[])
    {
        //create an instance for Scanner class 
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;
        double r;

        //Take input from the user 
        System.out.println("Enter the Radius of cirle :");
        r = sc.nextDouble();

        double area = pi*r*r;

        //now print the area of  the circle 
        System.out.println("Area of the circle : "+ area);
    } 
}

