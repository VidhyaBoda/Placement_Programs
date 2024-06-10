public class Program8 {
    public static void main(String[] args) {
        String str = "-000edrfwerf00456";
        int sign = 0;
        if(str.length()!=0 && str.charAt(0)=='-'){
            sign=1;
        }
        String num = "0123456789";
        String ans="";
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            if(flag && str.charAt(i)=='0'){
                continue;
            }
            
            if(num.contains(str.charAt(i)+"")){
                ans+=str.charAt(i);
                flag=false;
            }
        }
        
        if(ans==""){
            System.out.println(0);
            return;
        }
        int ansVal = Integer.parseInt(ans);
        if(sign==1){
            System.out.println(ansVal-2*ansVal);
        }
        else{
            System.out.println(ansVal);
        }
    }
}