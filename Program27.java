// Create a program that would accept a string from the user and print a pattern. For example, if
// the user enters “Hello”, it should print a pattern as follows:
// H
// He
// Hel
// Hell
// Hello


public class Program27 {
    public static void main(String[] args){
        String s = "Hello";
        for(int i=0; i<=s.length(); i++){
            String ch= s.substring(0, i);
            System.out.println(ch);
        }
    }
}
