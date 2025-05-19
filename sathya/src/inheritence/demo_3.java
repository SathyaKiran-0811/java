package inheritence;
class Fruit {
	void Benifits ()
{
		System.out.println ("healthy");
		}
}
class Apple extends Fruit{
	void Color()
	{
	System.out.println ("red");
	
	}
}
class Mango extends Fruit{
	void Taste()
	{
		System.out.println("sweet");
		
	}
}
class Banana extends Fruit {
	void Price()
	{
		System.out.println("kg 60");
	}

	
}
public class demo_3 {
	public static void main (String []args){
		Apple a1=new Apple();
		Mango m1=new Mango();
		Banana b1=new Banana();
		a1.Color();
		m1.Taste();
		b1.Price();
		a1.Benifits();
	}

}
