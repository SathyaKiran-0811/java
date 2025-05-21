package methods00;

public class Test24 implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread (new Test24());
		t1.start();

	}

}
