class Example02
{
	static class A2
	{
		static int a=10;
		private int b=20;
		int c=30;
	}
	public static void main(String [] args)
	{
		System.out.println(A2.a);
		A2 a=new A2();
		
		System.out.println(a.b);
		System.out.println(a.c);
	}
}