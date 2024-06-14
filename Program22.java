// W.A.P. to read the size of square and character to print the square.
// Example:
// Enter the size of square: 5
// Enter the character: #
// #    #    #    #    #
// #                   #
// #                   #
// #                   #
// #    #    #    #    #

public class Program22 {
    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n-1 || j == n-1 || j == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                } 
            }
            System.out.println();
        }
    }
}
