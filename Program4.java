import java.util.Scanner;

public class Program4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n<10){
            System.out.println(n);
        }
        else{
            String str="";
            for(int i=1;i<=n;i++){
                str+=i;

            }
            System.out.println(str.charAt(n-1));
        }
    }
}