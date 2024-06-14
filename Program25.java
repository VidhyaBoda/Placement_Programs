// Accept three integer values from the user and display them in ascending order using only operators 
// (i.e. without using if…else, switch case, or loop).

import java.util.Scanner;

public class Program25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter third integer: ");
        int c = sc.nextInt();

        int min = (a < b)? (a < c)? a : c : (b < c)? b : c;
        int mid = (a == min)? ((b < c)? b : c) : ((b == min)? ((a < c)? a : c) : ((c < a)? c : a));
        int max = (a > b)? (a > c)? a : c : (b > c)? b : c;

        System.out.println("Ascending order: " + min + ", " + mid + ", " + max);
    }
}