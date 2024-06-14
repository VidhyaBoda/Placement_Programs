// W.A.P. to check given number is palindrome or not.

public class Program15 {

    public static void main(String[] args)
    {
        int n = 1234321;
        int rev = reversNumber(n);
        System.out.println("Reverse of n =" + rev);

        if(n == rev){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
    
    static int reversNumber(int n){
        int revN = 0;
        while (n>0){
            revN = revN * 10 + n % 10;
            n = n/10;
        }
        return revN;
    }
}
