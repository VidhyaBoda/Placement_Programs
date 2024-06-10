import java.util.Scanner;

class MinStack{
    int arr[] = new int[100],top=-1;
    public void push(int val){
        top++;
        if(top>arr.length){
            System.out.println("Stack Overflow");
            return;
        }
        arr[top]=val;
    }

    public int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return -1;
        }
        int val = arr[top];
        return val;

    }

    public int minimum(){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }
}
public class Program2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MinStack st = new MinStack();
        st.push(-2);
        st.push(0);
        st.push(-3);
        System.out.println(st.minimum());
    }
}