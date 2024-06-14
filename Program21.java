// W.A.P. to read n numbers in an array and remove the duplicates from an array.

import java.util.*;

public class Program21 {
    public static int removeDuplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1,5,5,7,10 };
        int n = a.length;
 
        n = removeDuplicates(a, n);
 
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}