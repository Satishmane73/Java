class Example08
{
	class A08
	{
		void m1()
		{
			System.out.println("NSUIC M1 ");
		}
		void m2()
		{
			A08 a=new A08();
			a.m1();
		}
	}
	public static void main(String a[])
	{
		Example08.A08 a1=new Example08().new A08();
		a1.m2();
	}
}