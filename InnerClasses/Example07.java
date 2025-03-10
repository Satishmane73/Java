class Example07
{
	static int a=10;
	int x=20;
	
	static class A07
	{
		static int a=50;
		int x=60;
		
		void m1()
		{
			System.out.println(a);
			System.out.println(x);
			
			Example07 e=new Example07();
			System.out.println(Example07.a);
			System.out.println(e.a);
		}
	}
	void m2()
	{
		System.out.println(a);
		System.out.println(x);
		
		A07 a=new A07();
		System.out.println(A07.a);
		System.out.println(a.x);
	}
	public static void main(String [] args)
	{
		Example07 e=new Example07();
		e.m2();
		
		A07 a=new A07();
		a.m1();
	}
}