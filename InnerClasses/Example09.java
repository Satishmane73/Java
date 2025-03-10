class Example09
{
	int x=20;
	class A09
	{
		int x=50;
		void m1()
		{
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Example09.this.x);
		}
		void m2()
		{
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Example09.this.x);
		}
	}
	void m3()
	{
		System.out.println(x);
		
		A09 a0=new A09();
		System.out.println(a0.x);
	}
	public static void main(String [] args)
	{
		Example09 a1=new Example09();
		a1.m3();
		
		Example09.A09 a2=new Example09().new A09();
		a2.m1();
		a2.m2();
	}
}