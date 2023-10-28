/* Java program to finr the area of the square */

import java.util.*;
public class area_of_square {
    public static void main(String args[])
    {
        //create an instance for the scanner class
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println("Enter the side : ");
        s = sc.nextInt();

        int area = s*s;
         
        //now print the area of the squaree
        System.out.println("Area of the Square : " + area);
    }
}
