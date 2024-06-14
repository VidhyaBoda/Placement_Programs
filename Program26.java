// Accept a positive number from the user and print a message stating whether the number entered is even or 
// odd WITHOUT using the module (%)operator and if... else statements.

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        String message = (num / 2 * 2 == num) ? "even" : "odd";

        System.out.println("The number " + num + " is " + message);
    }
}