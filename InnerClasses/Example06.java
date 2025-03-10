class Example06
{
	static
	{
		System.out.println("outer Class Loaded");
	}
	Example06()
	{
		System.out.println("outer Class Constuctore");
	}
	static class A06
	{
		static 
		{
			System.out.println("Inner Class Constuctore");
		}
		A06()
		{
			System.out.println("outer Class Constuctore");
		}
		static void m1()
		{
			System.out.println("inner class SM");
		}
		void m2()
		{
			System.out.println("inner class NSM");
		}
		public static void main(String [] srgs)
		{
			System.out.println("inner class main method");
			
			Example06.m3();
			Example06 e= new Example06();
			e.m4();
		}
	}
	static void m3()
	{
		System.out.println("outer class SM");
	}
	void m4()
	{
		System.out.println("outer Class NSM");
	}
	public static void main(String [] args)
	{
		System.out.println("outer Class main method");
		A06.m1();
		
		A06 e=new A06();
		
		e.m2();
	}
}