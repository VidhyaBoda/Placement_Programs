// W.A.P. to check given number is odd or even using bitwise operator.

public class Program16 {

    public static void main(String[] args){
        int n = 100;
        System.out.println(isEven(n)==true ? "Even Number" : "Odd Number");
    }
    
    static boolean isEven(int n){
        if((n^1) == (n+1)){
            return true;
        }
        else{
            return false;
        }
    }
}
