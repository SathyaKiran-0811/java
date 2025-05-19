package inheritence;
class Bike {
	void speed () {
		System.out.println("145 km/hr");
		
	}
}
class Tvs extends Bike {
	void Rpm(){ 
		System.out.println("speed");
		
		}
	
 }
class Model extends Tvs {
	void price(){ 
		System.out.println("4lac");
	}
}
		

public class demo_2 {

	public static void main(String args[]) {
		Model m1=new Model();
		m1.price();
		m1.Rpm();
		m1.speed();
		
	}
}
