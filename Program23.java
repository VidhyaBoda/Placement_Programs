// An electricity board charges the following rates for the use of electricity: For the first 200 units 80 
// paisa per unit, For the next 100 units 90 paisa per unit and beyond 300 units Rs 1.00 per unit. All users
// are charged minimum of Rs.100 as meter charge. If the total amount is more than Rs. 300 then an additional 
// surcharge of 12.36% of total amount is charged. W.A.P. to read the number of units consumed and printout 
// the bill amount.

import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double billAmount = calculateBill(units);

        System.out.println("The total bill amount is: Rs." + billAmount);
    }

    public static double calculateBill(int units) {
        double billAmount = 0;

        if (units <= 200) {
            billAmount = units * 0.80;
        } else if (units <= 300) {
            billAmount = 200 * 0.80 + (units - 200) * 0.90;
        } else {
            billAmount = 200 * 0.80 + 100 * 0.90 + (units - 300) * 1.00;
        }

        billAmount += 100; 

        if (billAmount > 300) {
            billAmount += billAmount * 0.1236; 
        }

        return billAmount;
    }
}