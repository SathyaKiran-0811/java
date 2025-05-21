import java.util.*;

public class prc_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b value:");

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int c = a / b;

            System.out.println("Result: " + c);

    		System.out.println(c);
    	}catch(ArithmeticException e) {
    		
    		System.out.println(e.getMessage());
    	}finally {
    		System.out.println("hiii");
    		
    	}
    }
    }

/*import java.util.*;

public class prc_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b value:");

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int c = a / b;

            System.out.println("Result: " + c);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}*/
