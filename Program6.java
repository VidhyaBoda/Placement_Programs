import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=15;
        int n2=18;
        int xor = n1 ^ n2;
        
       int ans=0;
        while(xor>0){
            if(xor%2==1){
                ans++;
            }
            xor/=2;
        }
        System.out.println(ans);
        
    }
}