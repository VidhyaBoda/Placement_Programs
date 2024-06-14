// W.A.P. to find the largest number from given 3 numbers using conditional operator.

public class Program13 {
    public static void main(String[] args){

    int a = 5, b = 20, c = 15, max;

    max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

    System.out.println("Maximum number " + a + ", " + b + " and " + c + " is "+ max);
    }
}
