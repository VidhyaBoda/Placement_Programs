// W.A.P. to print series 1, 3, 6, 10, 15, …

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1;i<n;i++){
            sum+=i;
            System.out.print(sum+" ");
        }
    }
}
