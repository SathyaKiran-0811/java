package cdc;
import java.io.*;

public class Test_27 {


	

	public class New7 {
	    public static void main(String[] args) throws IOException {
	        // Escape backslashes correctly
	        FileWriter f1 = new FileWriter("C:\\Users\\sathya\\Desktop\\java.txt");
	        f1.write("hi how are you");
	        f1.close();
	        System.out.println("success");
	        }
	    }
}
