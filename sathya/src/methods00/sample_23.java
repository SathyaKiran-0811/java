package methods00;

public class sample_23 {
	void show () {
		System.out.println("hi");
		
	}
	class Test23{
		void print() {
			System.out.println("hello");
		}
	}
	public static void main (String[] arg ) {
		sample_23 s1=new sample_23();
		s1.show();
		sample_23.Test23 t1=new sample_23 ().new Test23();
				t1.print();
	}
}
