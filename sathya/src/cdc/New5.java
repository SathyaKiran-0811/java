package cdc;
import java.io.*;

public class New5 {
    public static void main(String[] args) throws IOException {
        // Escape backslashes correctly
        File f1 = new File("C:\\Users\\sathya\\Desktop\\java.txt");

        if (f1.createNewFile()) {
            System.out.println("created success");
        } else {
            System.out.println("not created");
        }
    }
}
