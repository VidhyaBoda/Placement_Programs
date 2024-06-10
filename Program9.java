public class Program9 {
    public static void main(String[] args) {
        int[] array = {11,2,3,2,2,13};
        int i=0;
        int j=array.length-1;
        int min=100000;
        while (i<=j) {
            if(array[i]<min){
                min=array[i];
                
            }
            if(array[j]<min){
                min=array[j];
            }
            
            i++;
            j--;
        }
        System.out.println(min);

        
    }
}