// W.A.P. that copies itself in another file called code.txt.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Program20 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("new.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Code.txt"));
            String line;
            writer.write(reader.readLine());
            reader.close();
            writer.close();
            System.out.println("success");
        }catch(Exception e){
            System.out.println("error occurs");
        }
    }
}