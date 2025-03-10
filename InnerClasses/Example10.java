class Example10
{
	static int a=10;
	int b=20;
	
	static void m1()
	{
		final int c=30;
		int d=40;
		class B
		{
			void m1(final int e,int f)
			{
				System.out.pritnln(a);
				System.out.pritnln(b);
				System.out.pritnln(c);
				System.out.pritnln(d);
				System.out.pritnln(e);
				System.out.pritnln(f);
				
			}
		};
		void m2()
		{
			class c
			{
				void m2()
				{
					System.out.println(a);
					System.out.println(b);
				}
			}
		}rl 7  g. q 
	}
	public static void main(String [] args)
	{
		Example10 a1=new Example10();
		a1.a=5;
		a1.b=6;
		a1.m1();
		a1.m2();
		
		Example10 a2=new Example10();
		a2.a=7;
		a2.b=8;
		a2.m1();
		a2.m2();
		
	}
}