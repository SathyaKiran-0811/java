/*package methods00;
class Test1{
	 void show()
	{
		System.out.println("hi");
	}
}
public class final_1 extends Test1{
	void show()
	{
		int a=56;
		System.out.println(a);
		a=54;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final_1 f1=new final_1();
	f1.show();
}

}*/
package methods00;
class Test1{
	 final void show()
	{
		System.out.println("hi");
	}
}
public class final_1 extends Test1{
	final void show()
	{
		int a=56;
		System.out.println(a);
		a=54;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final_1 f1=new final_1();
	f1.show();
}

}
