// Accept two integers from the user and calculate the sum of last digits of both the integers. For example, 
// if the numbers are 27 and 459, then the sum of last digits would be 16 (i.e. 7 + 9).

public class Program24 {
    public static  void main(String[] args){
        int a = 15;
        int b = 212;

        int last = a % 10;
        int last1 = b % 10;
        System.out.println("Last two digit sum is:"+( last + last1 ));
    }
}
