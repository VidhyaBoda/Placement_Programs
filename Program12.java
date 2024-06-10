public class Program12 {
    public static void main(String[] args) {
        String[] array = {"apple","pea"};
        String str="applepenapple";
        boolean flag=false;
        for(String word:array){
            if(str.contains(word)){
                flag=true;

            }
            str.replace(word, "");
        }
        if(flag==true && str==""){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}