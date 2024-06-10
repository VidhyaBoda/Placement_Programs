import java.util.Scanner;
public class Program3{

    public static long findFactotial(int n){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static int countZeros(int n){
        long fact = findFactotial(n),r;
       int count=0;
        System.out.println(fact);
        while(fact>0){
            r=fact%10;
            fact/=10;
            if(r!=0){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = countZeros(n);
        System.out.println(count);
    }
}