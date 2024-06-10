public class Program11 {
    public static void main(String[] args) {
        int m = 7,n=-3,ans=0;
        int n1 = Math.abs(m);
        int n2 = Math.abs(n);
        while (n1>n2) {
            ans++;
            n1-=n2;
        }
        if((m<0 && n<0) || (m>0 && n>0)){
            System.out.println(ans);
        }
        else{
            System.out.println(ans-2*ans);
        }
    }
}