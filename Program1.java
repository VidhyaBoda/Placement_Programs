import java.util.Scanner;

public class Program1 {

    public static int checkOccurrence(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();
        System.out.print("Enter needle: ");
        String needle = sc.nextLine();
        int ans = checkOccurrence(haystack, needle);
        System.out.println(ans);
    }
}