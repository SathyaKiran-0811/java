package inheritence;
class Movie{
	void ticket()
	{
		System.out.println("150 per tickets");
	}
}
class Hit extends Movie{
	void Action()
	{
		System.out.println("Romantic");
		
	}
}
class Hero extends Movie{
	void Name()
	{
		System.out.println("Nani");
	
		
	}

	public void Action() {
		// TODO Auto-generated method stub
		System.out.println("Romantic");
		
	}
}
class Heroin extends Movie{
	void Acting()
	{
		System.out.println("super");
	}
}


public class demo_4 {
	public static void main (String[] args) {
		Hero h1=new Hero();
		Heroin h2=new Heroin();
		h1.ticket();
		h1.Action();
		h1.Name();
		h2.Acting();
	}

}
