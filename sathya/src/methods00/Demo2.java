/*package methods00;

public class Demo2 implements Runnable {
	public void run() {
		System.out.println("hi");
	}
public static void main(String[] args) {
	Test1 t1=new Test1();
	Thread t2=new Thread(t1);
	System.out.println("hellow");
	t2.start();
	
}
	

}*/

package methods00;

public class Demo2 implements Runnable {
    public void run() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();           
        Thread t1 = new Thread(d);       
        System.out.println("hellow");
        t1.start();                      
    }
}
