// W.A.P. to read n numbers in an array and print the sum of odd numbers & even numbers.

public class Program18 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
         int even = 0, odd = 0;

         for(int i=0; i<arr.length; i++){
            if(arr[i] %2 == 0){
                even = even + arr[i];
            }
            else{
                odd = odd + arr[i];
            }

            System.out.println("Even Number Sum:" + even);
            System.out.println("Odd Number Sum:" + odd);
         }
    }
}
