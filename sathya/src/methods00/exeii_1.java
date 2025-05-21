package methods00;
public class exeii_1 {
	static void add(int a, int b) {
		if (b==0) {
		throw new ArithmeticException("hello boss");
		}
		int c=a/b;
		System.out.println(c);
		}
	public static void main(String[] args) {
		try {
			add(10,0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("covered all keywords");
		}
		
	}


	

}
