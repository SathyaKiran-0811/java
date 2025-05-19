package methods00;

public class Sample_26 {
	static void show() {
		System.out.println("hi");
		
	}
	static class Test_26{
		static void print() {
			System.out.println("hello");
			show();
		}
		
	}
	
	 
	
	public static void main (String []args) {
		Sample_26.Test_26.print();
		
	}
	}

