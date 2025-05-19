package methods00;
interface I1{
	abstract void add();
	void sub();
	
	
}

public class  interface_1 implements I1 {
	public void add () {
		System.out.println("sathya");
		
	}
	public void sub () {
		System.out.println("meghana");
	}

	public static void main(String[] args) {
		 interface_1 t1=new interface_1();
		t1.add();
		t1.sub();
		
		// TODO Auto-generated method stub

	}

}
