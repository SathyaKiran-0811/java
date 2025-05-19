package day_2;

public class Demo_4 {
	public class switch_case {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a color");
			String color=sc.next();
			
			switch(color) {
			case "red":
				System.out.println("celebrate holi");
				break;
			case "green":
				System.out.println("celebrate ramzan");
				break;
			case "white":
				System.out.println("celebrate cristmas");
				break;
				default:
					System.out.println("no festival");
			}
		}

	}
}