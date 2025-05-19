package methods00;

public class This_1 {
	
	void add () {
		int a=98;
		System.out.println(a);
		
	}
	int a=66;

	void sub() {
		System.out.println(this.a);
		this.add();
		
	}

	public static void main(String[] args) {
		This_1 t1=new This_1();
		t1.sub();
		
		

	}

}

