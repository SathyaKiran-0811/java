package methods00;

class CheppanuException extends Exception {
    public CheppanuException(String message) {
        super(message);
    }
}

public class demo_12 {

    public static void ageCheck(int age) throws CheppanuException {
        if (age > 18) {
            throw new CheppanuException("nenu cheppanu");
        } else {
            System.out.println("na age 18 below");
        }
    }

    public static void main(String[] args) {
        try {
            ageCheck(20);  
        } catch (CheppanuException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("happy coding");
        }
    }
}

