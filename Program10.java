public class Program10 {
    public static void main(String[] args) {
        int[] array = {2,0,2,0,4};
       
        for(int i=0;i<array.length-1;i++){
            for(int j=i+array[i];j<array.length;j++){
                if(array[i]==0){
                    break;
                }
                if(array[j]==0){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}