/* Arithmetic opeations */

import java.util.Scanner;
public class arithmetic_operations {
    public static void main(String args[])
    {
        //create instance for scanner class
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("");
            System.out.println("Enter Two numbers");

            //Now taking first number from user 
            System.out.println("Enter First Number : ");
            int x = sc.nextInt();

            //Now taking second number from user 
            System.out.println("Enter Second number : ");
            int y = sc.nextInt();

            System.out.println("Choose the operation you want to perform : ");
            System.out.println("Choose 1 for Addition");
            System.out.println("Choose 2 for Subtraction");
            System.out.println("Choose 3 for Multiplication");
            System.out.println("Choose 4 for Division");
            System.out.println("Choose 5 for Modulus");
            System.out.println("Choose 0 for Exit");
            int n = sc.nextInt();

            switch(n)
            {
              case 1: int add;
                      add = x+y;
                      System.out.println("Addition = "+ add);
                      break;

                case 2: int sub;
                        sub = x-y;
                        System.out.println("Subtraction = "+ sub);
                        break;

                case 3: int mul;
                        mul = x*y;
                        System.out.println("Multiplication = "+ mul);
                        break;

                case 4: int div;
                        div = x%y;
                        System.out.println("Division = "+ div);
                        break;
                
                case 5: int mod;
                        mod = x/y;
                        System.out.println("Modulus = "+ mod);
                        break;
                    
                case 6: System.exit(0);
            }

        }

    }
}