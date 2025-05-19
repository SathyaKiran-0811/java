package cdc0;

public class interface0 {
	
interface num1{
	void add();
	
}
interface num2{
	void sub();
}
interface num3 extends num,num1{
	void mul();
	
	
}
public class ex1 implements num3{
	public void add() {
		System.out.println("add sathya");
	}
	public void sub() {
		System.out.println("Substract kiran");
	}
	public void mul() {
		System.out.println("Akhand sathya");
	}
	

	public static void main(String[] args) {
		ex1 ex1 = new ex1();
		ex1.add();
		ex1.sub();
		ex1.mul();
		

	}

}

}
