package day_3;

abstract  class demo_13 {

		abstract void add();
		abstract void sub();
	}

	class abstract3 extends prgm3 {
		public void add()
		{
			int a=9,b=7;
			System.out.println(a+b);
		}
		public void sub()
		{
			int a=7,b=3;
			System.out.println(a-b);
		}
		static void mul()
		{
			int a=9,b=8;
			System.out.println(a*b);
		}
		void div()
		{
			int x=9,y=8;
			System.out.println(x/y);
		}s
		void mod()
		{
			int p=6,q=8;
			System.out.println(p%q);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 abstract3 a3 =new abstract3();
	 a3.add();
	 a3.sub();
	 a3.mul();
	 a3.div();
	 a3.mod();
		}

	}
