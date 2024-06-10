import java.util.Scanner;

public class Program5{

    public static double binary(String bin){
        int in=0;
        String binInt="",binDec="";

        while(in<bin.length() && bin.charAt(in)!='.'){
            binInt+=bin.charAt(in);
            in++;
        }
        in++;
        for(int i=in;i<bin.length();i++){
            binDec+=bin.charAt(i);
        }

        
        double ans = 0,pow=0;
        for(int i=binInt.length()-1;i>=0;i--){
            if(binInt.charAt(i)=='1'){
                ans+=Math.pow(2, pow);

            }
            pow++;
        }
        pow=-1;
        for(int i=0;i<binDec.length();i++){
            if(binDec.charAt(i)=='1'){
                ans+=Math.pow(2, pow);
            }
            
            pow--;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string : ");
        String bin = sc.nextLine();
        double ans = binary(bin);
        System.out.println(ans);
    }
}