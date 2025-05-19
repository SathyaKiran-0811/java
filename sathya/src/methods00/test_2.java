package methods00;
class Sample2
{
	public Sample2()
	{
	System.out.println("good evening");
	}
	int x= 98;
	void print()
	{
		System.out.println("hello");
	}
}
public class test_2  extends Sample2{
	public test_2()
	{
		super();
	}
	void show()
	{
		int y=78;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
		}
	

	public static void main(String[] args) {
		test_2 s1 = new test_2();
		s1.show();

	}

}