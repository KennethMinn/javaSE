package ExceptionHandling;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide : ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by : ");
            int y = scanner.nextInt();

            int z = x / y;
        } catch (ArithmeticException e) {
            //execution will jump here if it's related to ArithmeticException
            System.out.println("U can't divide by zero " + e);
        } catch (Exception e) {
            //this will catch all exceptions
            System.out.println("error");
        } finally {
            System.out.println("this will always print");
            scanner.close();
        }
    }
}
