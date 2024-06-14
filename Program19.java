// W.A.P. to print odd numbers that are divisible by 7 but not divisible by 3 between 150 and 445.

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        for(int i=150;i<=455;i++){
            if(i%7==0 && i%3!=0 && i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}